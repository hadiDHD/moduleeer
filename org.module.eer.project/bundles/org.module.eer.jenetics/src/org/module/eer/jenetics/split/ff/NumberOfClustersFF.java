package org.module.eer.jenetics.split.ff;

import java.util.function.Function;

import io.jenetics.BitChromosome;
import io.jenetics.Genotype;

@SuppressWarnings("rawtypes")
public class NumberOfClustersFF implements Function<Genotype, Double> {
	
	@Override
	public Double apply(Genotype genotype) {
		final BitChromosome bc = (BitChromosome) genotype.get(1);
		int numberOfClusters = bc.bitCount() + 1;
		return (double) numberOfClusters;
	}
}
