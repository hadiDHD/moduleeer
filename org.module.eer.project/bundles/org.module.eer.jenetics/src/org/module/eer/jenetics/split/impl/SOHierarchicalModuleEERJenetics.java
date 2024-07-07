package org.module.eer.jenetics.split.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.module.eer.jenetics.config.utils.ModularizableElementUtils;
import org.module.eer.jenetics.split.ISplitModulEER;
import org.module.eer.jenetics.split.ff.ModuleFF;
import org.module.eer.jenetics.split.ff.SingleObjectiveModularizableFF;
import org.module.eer.mm.moduleeer.MEERModel;
import org.module.eer.mm.moduleeer.ModularizableElement;
import org.module.eer.mm.moduleeer.Module;
import org.module.eer.mm.moduleeer.impl.ModuleeerFactoryImpl;

import io.jenetics.BitChromosome;
import io.jenetics.Chromosome;
import io.jenetics.EliteSelector;
import io.jenetics.Genotype;
import io.jenetics.MultiPointCrossover;
import io.jenetics.Mutator;
import io.jenetics.PartialAlterer;
import io.jenetics.PartiallyMatchedCrossover;
import io.jenetics.PermutationChromosome;
import io.jenetics.Phenotype;
import io.jenetics.SwapMutator;
import io.jenetics.engine.Engine;
import io.jenetics.engine.EvolutionResult;
import io.jenetics.ext.moea.MOEA;
import io.jenetics.ext.moea.NSGA2Selector;
import io.jenetics.ext.moea.Vec;
import io.jenetics.util.ISeq;
import io.jenetics.util.IntRange;

//TODO Single Objective remove?
public class SOHierarchicalModuleEERJenetics implements ISplitModulEER {	
	
	@Override
	public EList<MEERModel> splitModules(Module splittingModule) {			
		int sizeOfModularizableElements = splittingModule.getModularizableElements().size();
		int optimalNumberOfModules = sizeOfModularizableElements/ModuleFF.OPTIMAL_SIZE_PER_MODULE;
		int maxOfReferences = ModularizableElementUtils.maxNumberofReferences(splittingModule.getModularizableElements());
		@SuppressWarnings({ "unchecked", "rawtypes" })
		final Engine engine = Engine
				.builder(new SingleObjectiveModularizableFF(splittingModule.getModularizableElements(), maxOfReferences, optimalNumberOfModules)
						//new CRAIndexNumberOfModules(splittingModule.getModularizableElements())
						,
						encoding(sizeOfModularizableElements))
				//.constraint(new ModularizableDependenciesConstraint(ModularizableElementUtils.
				//		dependenciesOfAllModularizableElements(splittingModule.getModularizableElements())))
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
				.maximizing()
				.survivorsSelector(new EliteSelector<>(8))
				.populationSize(200)
				.build();
		
		@SuppressWarnings("unchecked")
		final Genotype best = (Genotype) engine.stream()
							 	.limit(100)
							 	//TODO statistics remove?
							 	//.peek(new StatisticsModulEER())
							 	.collect(EvolutionResult.toBestGenotype());
		EList<MEERModel> resultOfSplittingModels = new BasicEList<MEERModel>();
		resultOfSplittingModels.add(convertPhenotypeToModulEER(best,splittingModule));		
		return resultOfSplittingModels;		
	}	

	@SuppressWarnings("rawtypes")
	private MEERModel convertPhenotypeToModulEER(Genotype genotype, Module splittingModule) {
		MEERModel splittedMEERModel = ModuleeerFactoryImpl.eINSTANCE.createMEERModel();
		splittedMEERModel.setName("Splitted " + splittingModule.getName());
		Copier copier = new Copier();
		EList<Module> listOfModules = new BasicEList<Module>();
		Module currentModule = ModuleeerFactoryImpl.eINSTANCE.createModule();
		listOfModules.add(currentModule);
		final PermutationChromosome pc = (PermutationChromosome) genotype.get(0);
		final BitChromosome bc = (BitChromosome) genotype.get(1);
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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static final Genotype encoding(int size) {		
		return Genotype.of(
				(Chromosome) PermutationChromosome.ofInteger(size),
				(Chromosome) BitChromosome.of(size - 1)			
				);
	}
}
