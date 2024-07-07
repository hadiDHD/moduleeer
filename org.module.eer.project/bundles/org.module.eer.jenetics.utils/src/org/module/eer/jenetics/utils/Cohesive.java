package org.module.eer.jenetics.utils;

public class Cohesive {
	
	private int cohesion;
	private int coupling;
	
	public Cohesive() {
		this.cohesion = 0;
		this.coupling = 0;
	}

	public Cohesive(int cohesion, int coupling) {
		this.cohesion = cohesion;
		this.coupling = coupling;
	}

	public int getCohesion() {
		return cohesion;
	}

	public void setCohesion(int cohesion) {
		this.cohesion = cohesion;
	}

	public int getCoupling() {
		return coupling;
	}

	public int calculatesCRAIndex() {
		return this.cohesion - this.coupling;
	}
	
	public double calculatesRelativeCohesion() {
		// if coupling is 0 means that all elements are in the same module or
		// there is no links among modules
		if (coupling == 0)
			return cohesion;
		return cohesion/coupling;
	}
	
	public void incrementCohesion() {
		this.cohesion += 1;
	}
	
	public void incrementCoupling() {
		this.coupling += 1;
	}
}
