package com.manny.methodexercises.findmaxint;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {

	public static void main(String[] args) {
		// Initialize sc
		Scanner sc = new Scanner(System.in);
		// Gets input of type String from user
		System.out.print("Please, enter integer numbers separated by space: ");
	    String userInput = sc.nextLine();
	    
	    // Converts userInput into String Array
	    String[] intStringArray = userInput.split(" ");
	    
	    // Converts String Array of user input to int Array
	    int[] intArray = stringArrayToIntArray(intStringArray);
	    
	    
	    // Gets max number from intArray
	    int maxInt = findMaxIntInArray(intArray);
	
	    // Output user input and max number to console
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(intArray));
		System.out.println("*** Max number in array ***");
		System.out.println(maxInt);
	}


	/**
	 * Converts a given String Array to Integer Array
	 * @param intStringArray A String Array
	 * @return Integer array of intStringArray
	 */
	private static int[] stringArrayToIntArray(String[] intStringArray) {
		// Gets length of String Array
		int arrayLength = intStringArray.length;
	    // Creates new Integer Array with same length as String Array
	    int[] intArray = new int[arrayLength];
	    // Loops through all elements of String Array
	    for (int i = 0; i < arrayLength; i++) {
	    	// Adds integer value of current element to intArray
	    	intArray[i] = Integer.parseInt(intStringArray[i]);
	    }
	    // Returns intArray
		return intArray;
	}

	/**
	 * Returns max integer in an array of integers
	 * @param intArray An array of integers
	 * @return max integer in an array of integers
	 */
	public static int findMaxIntInArray(int[] intArray) {
        // Initializing variable to hold max integer to 0
		int maxInt = 0;
		// Runs a loop through all elements of intArray
		for (int number : intArray) {
			// Sets maxInt to current element if current if greater than maxInt
			if (number > maxInt) {
				maxInt = number;
			}
		}
		// Returns maxInt
		return maxInt;
	}

}

