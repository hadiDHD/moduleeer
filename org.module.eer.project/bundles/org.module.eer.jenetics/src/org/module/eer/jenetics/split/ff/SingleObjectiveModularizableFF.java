package org.module.eer.jenetics.split.ff;

import java.util.function.Function;

import org.eclipse.emf.common.util.EList;
import org.module.eer.mm.moduleeer.ModularizableElement;

import io.jenetics.Genotype;

@SuppressWarnings("rawtypes")
public class SingleObjectiveModularizableFF implements Function<Genotype, Double>{
	
	private EList<ModularizableElement> modularizableElements;
	private int maxOfReferences;
	private int optimalNumberOfModules;
	
	public SingleObjectiveModularizableFF(EList<ModularizableElement> modularizableElements, int maxOfReferences, int optimalNumberOfModules) {
		this.modularizableElements = modularizableElements;
		this.maxOfReferences = maxOfReferences;
		this.optimalNumberOfModules = optimalNumberOfModules;
	}

	@Override
	public Double apply(Genotype genotype) {
		double craIndexNormalize = normalizeCRAIndex(new CRAIndexFF(this.modularizableElements).apply(genotype));
		double balance = new CoefficientOfVariabilityFF().apply(genotype);
		double normalizeModules = normalizesModules(new NumberOfClustersFF().apply(genotype));		
		return craIndexNormalize + balance + normalizeModules;
	}
	
	private double normalizesModules(Double currentClusters) {
		if (currentClusters > this.optimalNumberOfModules) 
			return this.optimalNumberOfModules/currentClusters;
		return currentClusters/this.optimalNumberOfModules;
	}

	public double normalizeCRAIndex(double craIndex) {		
		return craIndex/this.maxOfReferences;		
	}

}
