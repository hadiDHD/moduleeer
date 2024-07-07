package org.module.eer.jenetics.config;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import io.jenetics.Genotype;
import io.jenetics.IntegerChromosome;
import io.jenetics.IntegerGene;
import io.jenetics.Phenotype;
import io.jenetics.engine.Constraint;
import io.jenetics.util.MSeq;

/*
 * This class is for repair the generated Chromosome after the execution of the Alterers
 * This class takes as an input a map of dependencies
 * The repair check that the Genotype fullfil the list of dependencies 
 * 
 * */

public class ModularizableDependenciesConstraintOld implements Constraint<IntegerGene,Double> {

	private Map<Integer, List<Integer>> mapOfRelationships; 
	
	public ModularizableDependenciesConstraintOld(Map<Integer, List<Integer>> mapOfRelationships) {
		this.mapOfRelationships = mapOfRelationships;
	}

	@Override
	public Phenotype<IntegerGene, Double> repair(Phenotype<IntegerGene, Double> individual, long generation) {
		MSeq<IntegerGene> repairChromosome = MSeq.of(individual.genotype().chromosome());		
		for(Map.Entry<Integer, List<Integer>> relationshipEntry : mapOfRelationships.entrySet()) { 
			int relationShipIndex = relationshipEntry.getKey();
			updateRelationshipModule(relationShipIndex, repairChromosome, relationshipEntry.getValue());				
		}
		return newPhenotype(repairChromosome,generation);
	}
	
	private Phenotype<IntegerGene, Double> newPhenotype(MSeq<IntegerGene> repairChromosome, long generation) {
		final Genotype<IntegerGene> genoType = Genotype.of(IntegerChromosome.of(repairChromosome));	
		return Phenotype.of(genoType, generation);
	}
	
	public void updateRelationshipModule(int relationShipIndex, MSeq<IntegerGene> repairChromosome,
			List<Integer> dependeciesList) {
		IntegerGene relationshipModule = repairChromosome.get(relationShipIndex);
		Iterator<Integer> itDependencies = dependeciesList.iterator();
		boolean equalGene = false;
		while (itDependencies.hasNext()) {
			Integer seqIndex = (Integer) itDependencies.next();
			if (repairChromosome.get(seqIndex).intValue() == relationshipModule.intValue()) {
			    equalGene = true;
				break;
			}
		}
		if (equalGene == false) {
			//Random position
			int randomPosition = new Random().nextInt(dependeciesList.size());
			repairChromosome.set(relationShipIndex, IntegerGene.of(
					repairChromosome.get(dependeciesList.get(randomPosition)).intValue(),
					repairChromosome.get(dependeciesList.get(randomPosition)).min(),
					repairChromosome.get(dependeciesList.get(randomPosition)).max())										
					);			
		}		
	}

	@Override
	public boolean test(Phenotype<IntegerGene, Double> individual) {
		for(Map.Entry<Integer, List<Integer>> relationshipEntry : this.mapOfRelationships.entrySet()){
			int relationShipIndex = relationshipEntry.getKey();
			IntegerGene relationshipModule = individual.genotype().chromosome().get(relationShipIndex);
			Iterator<Integer> dependeciesList = relationshipEntry.getValue().iterator();
			boolean equalGene = false;
			while (dependeciesList.hasNext()) {
				Integer seqIndex = (Integer) dependeciesList.next();
				if (individual.genotype().chromosome().get(seqIndex).intValue() == relationshipModule.intValue()) {
					equalGene = true;
					break;				
				}	
			}
			if (equalGene == false)
				return false;
		}	
		return true;
	}

}
