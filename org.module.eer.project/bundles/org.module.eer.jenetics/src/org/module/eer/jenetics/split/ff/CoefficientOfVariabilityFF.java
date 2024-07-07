package org.module.eer.jenetics.split.ff;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;
import com.google.common.primitives.Doubles;

import io.jenetics.BitChromosome;
import io.jenetics.Genotype;

@SuppressWarnings("rawtypes")
public class CoefficientOfVariabilityFF implements Function<Genotype, Double> {
	
	@Override
	public Double apply(Genotype genotype) {
		final BitChromosome bc = (BitChromosome) genotype.get(1);
		Map<Integer, Integer> elementsPerModule = new HashMap<Integer, Integer>();
		int currentModule = 0;
		elementsPerModule.put(currentModule, 0);
		for (int i = 0; i < bc.length(); i++) {
			elementsPerModule.replace(currentModule, elementsPerModule.get(currentModule) + 1);
			if (bc.get(i).bit() == true) {
				currentModule += 1;
				elementsPerModule.put(currentModule, 0);
			} 
		}
		// Add to the last module, the last element
		elementsPerModule.put(currentModule, elementsPerModule.get(currentModule) + 1);		
		return variabilityCoefficient(elementsPerModule);		
	}
	
	//TODO test remove?
	private double variabilityCoefficient(Map<Integer, Integer> elementsPerModule) {
		StandardDeviation stats = new StandardDeviation(false);		
		double standardDeviation = stats.evaluate(Doubles.toArray(elementsPerModule.values()));
		double mean = new Mean().evaluate(Doubles.toArray(elementsPerModule.values()));		
		return standardDeviation/mean;		
	}
	
}
