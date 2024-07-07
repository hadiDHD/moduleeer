package org.module.eer.jenetics.split.ff;

import java.util.function.Function;

import io.jenetics.BitChromosome;
import io.jenetics.Genotype;
import io.jenetics.PermutationChromosome;

@SuppressWarnings("rawtypes")
public class AverageClassesPerModule implements Function<Genotype, Double> {

	
	@SuppressWarnings("unchecked")
	@Override
	public Double apply(Genotype genotype) {
		final BitChromosome bc = (BitChromosome) genotype.get(1);
		final PermutationChromosome<Integer> pc = (PermutationChromosome<Integer>) genotype.get(0);
		int numberOfClusters = bc.bitCount() + 1;
		int numberOfElements = pc.length();			
		return (double) (numberOfElements/numberOfClusters);
	}

}
