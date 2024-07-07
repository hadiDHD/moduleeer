package org.module.eer.jenetics.split.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.module.eer.jenetics.config.utils.ModularizableElementUtils;
import org.module.eer.jenetics.split.ISplitModulEER;
import org.module.eer.jenetics.split.constraint.ModularizableDependenciesConstraint;
import org.module.eer.jenetics.split.ff.MixedModularizableFF;
import org.module.eer.jenetics.split.stats.MEERStatistics;
import org.module.eer.jenetics.utils.Cohesive;
import org.module.eer.mm.moduleeer.MEERModel;
import org.module.eer.mm.moduleeer.ModularizableElement;
import org.module.eer.mm.moduleeer.Module;
import org.module.eer.mm.moduleeer.impl.ModuleeerFactoryImpl;

import io.jenetics.Chromosome;
import io.jenetics.Genotype;
import io.jenetics.BitChromosome;
import io.jenetics.MultiPointCrossover;
import io.jenetics.Mutator;
import io.jenetics.PartialAlterer;
import io.jenetics.PartiallyMatchedCrossover;
import io.jenetics.PermutationChromosome;
import io.jenetics.Phenotype;
import io.jenetics.SwapMutator;
import io.jenetics.engine.Constraint;
import io.jenetics.engine.Engine;
import io.jenetics.ext.moea.MOEA;
import io.jenetics.ext.moea.NSGA2Selector;
import io.jenetics.ext.moea.Vec;
import io.jenetics.util.ISeq;
import io.jenetics.util.IntRange;

public class HierarchicalModuleEERJenetics implements ISplitModulEER {	
	
	public static final int OPTIMAL_SIZE_PER_MODULE = 7;	
	
	@SuppressWarnings("rawtypes")
	public ISeq<Phenotype> performParetoSet(Module splittingModule) {
		final int sizeOfModularizableElements = splittingModule.getModularizableElements().size();
		final int optimalNumberOfModules = sizeOfModularizableElements/OPTIMAL_SIZE_PER_MODULE;		
		final Constraint modulEERConstraint = new ModularizableDependenciesConstraint(ModularizableElementUtils.
				dependenciesOfAllModularizableElements(splittingModule.getModularizableElements()), optimalNumberOfModules);		
		@SuppressWarnings({ "unchecked" })
		final Engine engine = Engine
				.builder(new MixedModularizableFF(splittingModule.getModularizableElements()), 
						modulEERConstraint.constrain(encoding(sizeOfModularizableElements)))						
				.constraint(modulEERConstraint)
				.alterers(
						//The `PartiallyMatchedCrossover` is used on chromosome with index 0.
						PartialAlterer.of(new PartiallyMatchedCrossover(0.9), 0),
						//The `PartiallyMatchedCrossover` is used on chromosome with index 1.
						PartialAlterer.of(new MultiPointCrossover(0.9), 1),
						//The SwapMutator is used on chromosome with index 0.
						PartialAlterer.of(new SwapMutator(0.1), 0),
						//The `Mutator` is used on chromosome with index 1.
						PartialAlterer.of(new Mutator(0.1), 1)
						)
				.survivorsSelector(NSGA2Selector.ofVec())
				.populationSize(200)
				.build();
		
		@SuppressWarnings({ "unchecked" })
		final ISeq<Phenotype> seqPhenotypes = (ISeq<Phenotype>) engine.stream()
				.limit(300)				
				.collect(MOEA.toParetoSet(IntRange.of(75, 100)));
		return seqPhenotypes;
	}	
	
	@Override
	public EList<MEERModel> splitModules(Module splittingModule) {		
		@SuppressWarnings({ "rawtypes" })
		final ISeq<Phenotype> seqPhenotypes = performParetoSet(splittingModule);
		
		EList<MEERModel> resultOfSplittingModels = new BasicEList<MEERModel>();
		for (@SuppressWarnings("rawtypes") Phenotype phenotype : seqPhenotypes) {
			resultOfSplittingModels.add(convertPhenotypeToModulEER(phenotype, splittingModule));
		}		
		return resultOfSplittingModels;		
	}	

	public Map<MEERModel, MEERStatistics> splitMEERModelStatistics(Module splittingModule) {
		@SuppressWarnings({ "rawtypes" })
		final ISeq<Phenotype> seqPhenotypes = performParetoSet(splittingModule);
		Map<MEERModel, MEERStatistics> modelsStatistics = new HashMap<MEERModel, MEERStatistics>(seqPhenotypes.length());
		
		for (@SuppressWarnings("rawtypes") Phenotype phenotype : seqPhenotypes) {
			MEERStatistics stats = getStatistics(phenotype.fitness());
			modelsStatistics.put(convertPhenotypeToModulEER(phenotype, splittingModule), stats);			
		}		
		return modelsStatistics;			
	}
	
	@SuppressWarnings("rawtypes")
	private MEERModel convertPhenotypeToModulEER(Phenotype phenotype, Module splittingModule) {
		MEERModel splittedMEERModel = ModuleeerFactoryImpl.eINSTANCE.createMEERModel();
		splittedMEERModel.setName("Splitted " + splittingModule.getName());
		Copier copier = new Copier();
		EList<Module> listOfModules = new BasicEList<Module>();
		Module currentModule = ModuleeerFactoryImpl.eINSTANCE.createModule();
		listOfModules.add(currentModule);
		final PermutationChromosome pc = (PermutationChromosome) phenotype.genotype().get(0);
		final BitChromosome bc = (BitChromosome) phenotype.genotype().get(1);
		for (int i = 0; i < bc.length(); i++) {
			currentModule.getModularizableElements().add( (ModularizableElement) 
					copier.copy(splittingModule.getModularizableElements().get((Integer) pc.get(i).allele())));
			if (bc.get(i).bit() == true) {
				currentModule = ModuleeerFactoryImpl.eINSTANCE.createModule();
				listOfModules.add(currentModule);
			}
		}
		currentModule.getModularizableElements().add( (ModularizableElement) 
				copier.copy(splittingModule.getModularizableElements().get((Integer) pc.get(bc.length()).allele())));
		copier.copyReferences();		
		splittedMEERModel.getModules().addAll(listOfModules);		
		return splittedMEERModel;
	}
	
	@SuppressWarnings("rawtypes")
	private MEERStatistics getStatistics(Comparable comparableFF) {
		if (comparableFF instanceof Vec) {
			Vec fitnessVec = (Vec) comparableFF;
			Object obj  = fitnessVec.data();
			if (obj instanceof double[]) {
				Cohesive cohesive = new Cohesive((int)((double[]) obj)[0], (int) ((double[]) obj)[1]);
				int numberOfModules = (int)((double[]) obj)[2];				
				return new MEERStatistics(cohesive, 
						numberOfModules, ((double[]) obj)[3], ((double[]) obj)[4]);				
			}
		}
		return null;
	}	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static final Genotype encoding(int size) {		
		return Genotype.of(
				(Chromosome) PermutationChromosome.ofInteger(size),
				(Chromosome) BitChromosome.of(size - 1)			
				);
	}
}
