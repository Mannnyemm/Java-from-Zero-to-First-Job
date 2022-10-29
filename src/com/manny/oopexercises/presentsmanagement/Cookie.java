package com.manny.oopexercises.presentsmanagement;

public abstract class Cookie extends Sweet {
	// Weight of dough in a Cookie
	private double doughWeight;

	/**
	 * @return double - the doughWeight of a Cookie in kilograms
	 */
	public double getDoughWeight() {
		return doughWeight;
	}

	/**
	 * Sets the doughWeight of a Cookie to given doughWeight
	 * @param doughWeight double - the doughWeight of a Cookie to set
	 */
	public void setDoughWeight(double doughWeight) {
		this.doughWeight = doughWeight;
	}
	

}
