package org.module.eer.jenetics.split.impl;

import java.util.function.Consumer;

import io.jenetics.BitChromosome;
import io.jenetics.PermutationChromosome;
import io.jenetics.Phenotype;
import io.jenetics.engine.EvolutionResult;

@Deprecated
@SuppressWarnings("rawtypes")
public class StatisticsModulEER implements Consumer {

	@Override
	public void accept(Object t) {
		if (t instanceof EvolutionResult) {
			EvolutionResult evolutionResult = (EvolutionResult) t;
			Phenotype phenotype = evolutionResult.bestPhenotype();
			final PermutationChromosome<Integer> pc = (PermutationChromosome<Integer>) phenotype.genotype().get(0);
			final BitChromosome bc = (BitChromosome) phenotype.genotype().get(1);
			Comparable ff = phenotype.fitness();
			
			
			
			
			System.out.println("Fitness Functions: " + ff.toString());
		}
		//System.out.println("Aqui");
	}

}
