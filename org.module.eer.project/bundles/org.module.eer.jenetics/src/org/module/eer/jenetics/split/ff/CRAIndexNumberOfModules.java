package org.module.eer.jenetics.split.ff;

import java.util.function.Function;

import org.eclipse.emf.common.util.EList;
import org.module.eer.mm.moduleeer.ModularizableElement;

import io.jenetics.Genotype;

public class CRAIndexNumberOfModules implements Function<Genotype, Double>{
	
	private EList<ModularizableElement> modularizableElements;
		
	public CRAIndexNumberOfModules(EList<ModularizableElement> modularizableElements) {
		this.modularizableElements = modularizableElements;		
	}

	@Override
	public Double apply(Genotype genotype) {
		double craIndexNormalize = new CRAIndexFF(this.modularizableElements).apply(genotype);
		double numberOfClusters = new NumberOfClustersFF().apply(genotype);		
		double balance = 1 - new CoefficientOfVariabilityFF().apply(genotype);
		return craIndexNormalize * numberOfClusters * balance;
	}
	
}
