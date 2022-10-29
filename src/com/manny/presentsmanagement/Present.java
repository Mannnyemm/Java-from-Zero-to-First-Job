package com.manny.presentsmanagement;

import java.util.Arrays;

public class Present {
	// Array of sweets
	private Sweet[] sweets;
	// Default length of sweets
	private final int DEFAULT_SWEETS_LENGTH = 10;
	// Last inserted index of sweets array
	private int lastIndex = 0;
	// Initializer
	{
		// Initialize length of sweets to 10
		sweets = new Sweet[DEFAULT_SWEETS_LENGTH];
	}
	
	/**
	 * Adds a given sweet to sweets - array of sweets
	 * @param sweet Sweet - sweet to add to sweets 
	 */
	public void addSweet(Sweet sweet) {
		// Exit function if all parameters are not met
		if (sweet == null) {
			return;
		}
		// Double length of sweets if lastIndex greater than or equal to sweets.length
		if (lastIndex >= sweets.length) {
			sweets = Arrays.copyOf(sweets, sweets.length << 1);
		}
		// Add sweet to sweets array
		sweets[lastIndex++] = sweet;
	}

	/**
	 * Calculates total weight of all sweets in sweets
	 * @return double - Weight of all sweets in sweets in Kilograms
	 */
	public double calculateTotalWeight() {
		// Total weight of sweets
		double totalWeight = 0;
		// Loop through Sweets in sweets
		for (Sweet sweet : sweets) {
			// Add weight of current sweet to totalWeight if current sweet is not null
			if (sweet != null) {				
				totalWeight += sweet.getWeight();
			}
		}
		// Return totalWeight
		return totalWeight;
	}

	public Sweet[] filterSweetsBySugarRange(double minSugarWeight,
			double maxSugarWeight) {
		// Array of sweets with sugar content within specified range
		Sweet[] filteredSweetsArray = new Sweet[sweets.length];
		// Current index to insert a sweet in filteredSweetsArray
		int currIndex = 0;
		// Loop through all sweets in sweets
		for (Sweet sweet : sweets) {
			// If a sweet's sugar weight is within specified range
			// Add it to filteredSweetsArray
			if (sweet != null && sweet.getSugarWeight() >= minSugarWeight && sweet.getSugarWeight() <= maxSugarWeight) {
				filteredSweetsArray[currIndex++] = sweet;
			}
		}
		// return filteredSweetsArray without null values
		return Arrays.copyOf(filteredSweetsArray, currIndex);
	}

	public Sweet[] getSweets() {
		// Returns non null elements in sweets
		return Arrays.copyOf(sweets, lastIndex);
	}

}