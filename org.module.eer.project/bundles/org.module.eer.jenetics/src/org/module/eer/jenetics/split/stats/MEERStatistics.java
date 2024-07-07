package org.module.eer.jenetics.split.stats;

import org.module.eer.jenetics.utils.Cohesive;

public class MEERStatistics {
	
	private Cohesive cohesive;
	private int numberOfModules;
	private double averageNumberOfModules;
	private double standardDeviation;
	
	public MEERStatistics(Cohesive cohesive, int numberOfModules, double averageNumberOfModules, double standardDeviation) {		
		this.cohesive = cohesive;
		this.numberOfModules = numberOfModules;
		this.averageNumberOfModules = averageNumberOfModules;
		this.standardDeviation = standardDeviation;
	}

	public Cohesive getCohesive() {
		return cohesive;
	}

	public int getNumberOfModules() {
		return numberOfModules;
	}

	public double getAverageNumberOfModules() {
		return averageNumberOfModules;
	}
	
	public double getStandardDeviation() {
		return standardDeviation;
	}
}