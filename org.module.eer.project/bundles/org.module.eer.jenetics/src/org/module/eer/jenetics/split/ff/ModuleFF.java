package org.module.eer.jenetics.split.ff;

import java.util.function.Function;

import io.jenetics.BitChromosome;
import io.jenetics.Genotype;

@SuppressWarnings("rawtypes")
public class ModuleFF implements Function<Genotype, Double> {
	
	
	
	public static final int OPTIMAL_SIZE_PER_MODULE = 7;
	private int optimalNumberOfModules;
	
	public ModuleFF(int optimalNumberOfModules) {
		this.optimalNumberOfModules = optimalNumberOfModules;
	}	
	
	@Override
	public Double apply(final Genotype genotype) {
		final BitChromosome bc = (BitChromosome) genotype.get(1);
		int numberOfClusters = bc.bitCount() + 1;
		double ff = Math.abs(numberOfClusters - this.optimalNumberOfModules);		 
		return ff;
	}	
}
