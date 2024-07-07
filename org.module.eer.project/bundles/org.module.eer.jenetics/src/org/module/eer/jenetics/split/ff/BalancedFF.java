package org.module.eer.jenetics.split.ff;

import java.util.Map;
import java.util.function.Function;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;
import org.module.eer.jenetics.config.utils.GenotypeUtils;

import com.google.common.primitives.Doubles;

import io.jenetics.Genotype;

@SuppressWarnings("rawtypes")
public class BalancedFF implements Function<Genotype, Double> {
	
	@Override
	public Double apply(Genotype genotype) {		
		Map<Integer, Integer> elementsPerModule = GenotypeUtils.genotypeElementsPerModule(genotype);	
		return standardDeviation(elementsPerModule);		
	}
	
	private double standardDeviation(Map<Integer, Integer> elementsPerModule) {
		StandardDeviation stats = new StandardDeviation(false);		
		return stats.evaluate(Doubles.toArray(elementsPerModule.values()));		
	}
	
}
