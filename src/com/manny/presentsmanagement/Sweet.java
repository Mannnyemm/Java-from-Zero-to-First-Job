package com.manny.presentsmanagement;

public abstract class Sweet {
	// Name of a sweet
	private String name;
	// Weight of a sweet in Kilograms
	private double weight;
	// Weight of sugar in a Sweet in Kilograms
	private double sugarWeight;
	
	/**
	 * @return String - the name of a Sweet
	 */
	public String getName() {
		return name;
	}
	/**
	 * Sets the name of a Sweet to given name
	 * @param name String - the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return double - the weight of a Sweet in Kilograms
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * Sets the weight of a Sweet to given weight
	 * @param weight double - the weight to set in Kilograms
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * 
	 * @return double - the sugarWeight of a Sweet in Kilograms
	 */
	public double getSugarWeight() {
		return sugarWeight;
	}
	/**
	 * Sets the sugarWeight of a Sweet to given sugarWeight
	 * @param sugarWeight double - the sugarWeight to set in Kilograms
	 */
	public void setSugarWeight(double sugarWeight) {
		this.sugarWeight = sugarWeight;
	}
	@Override
	public String toString() {
		return "Sweet [name=" + name + ", weight=" + weight + ", sugarWeight=" + sugarWeight + "]";
	}
	
	
}
