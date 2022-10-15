package com.manny.methodexercises.arrayextension;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExtension {
	
	public static void main(String[] args) {
		// Initialize sc to Scanner
		Scanner sc = new Scanner(System.in);
		// Ask user for length of initial array
		System.out.print("Please, enter length of initial array: ");
		// Gets user's input for length of initial array
		int baseArrayLength = sc.nextInt();
		// Generates an array of random integers with user's inputed length
		int[] arr = generateRandomArray(baseArrayLength);
		// Creates an array twice the size of initial array
		int[] extendedArray = extendArray(arr);
		// Prints both Initial and Extended array to console
		System.out.println("*** Initial array ***");
		System.out.println(Arrays.toString(arr));
		System.out.println("*** Extended array ***");
		System.out.println(Arrays.toString(extendedArray));
	}

	/**
	 * The method extends array.
	 * If array {1, 2, 3} has been passed to this method then array {1, 2, 3, 2, 4, 6}
	 * is returned from this method.
	 * 
	 * @param arr - base of extension. Extended array contains elements from this array
	 * and additionally contains the same elements multiplied by two. 
	 * @return extended array.
	 */
	public static int[] extendArray(int[] arr) {
		// Length of base array
		int oldLength = arr.length;
		// Creates new array with length twice of base array
		int[] extendedArray = new int[oldLength*2];
		// Loop through base array
		for (int i = 0; i < oldLength; i++) {
			// Adds old values of base array to the first half of extendedArray at their old indexes
			extendedArray[i] = arr[i];
			// Doubles the value of current element to the second half of extendedArray - like a reflection
			extendedArray[i+ oldLength] = arr[i] * 2;
		}
		// Returns the extended array
		return extendedArray;
	}

	/**
	 * Generates an array of random integers with a given length = amountOfElements
	 * @param amountOfElements Integer length of array
	 * @return generated array
	 */
	public static int[] generateRandomArray(int amountOfElements) {
		// Initialize arr to an array of integers with length of amountOfElements
		int[] arr = new int[amountOfElements]; 
		// Initialize random to Random
		Random random = new Random();
		// Generates a random integer for all indexes of arr
		for(int i = 0; i < amountOfElements; i++) {
			// This ensures that integer can be doubled in extended array and also excludes 0
			arr[i] = random.nextInt(((Integer.MAX_VALUE/2)-1) + 1);
		}
		// Return generated array
		return arr;
	}

}
