package com.manny.stringhw;

import java.util.Scanner;
import java.util.Arrays;

/**
 * 
 * @author Mannnyemm
 *
 * Strings homework Application
 */

public class StringHomeWork {

	public static void main(String[] args) {
		printPI();
		printWords();
	}

	/**
	 * Gets user input and print words in it
	 * excluding punctuation marks
	 */
	private static void printWords() {
		// Initialize scanner
		Scanner sc = new Scanner(System.in);
		// Ask user for input
		System.out.println("Please enter any sentence here: ");
		// Gets user input
		String userInput = sc.nextLine();
//		// Splits string into array of words
		String[] result =  userInput.split("[^\\w]+");
		// Displays result
		System.out.println("result= " + Arrays.toString(result));
	}
	
	/**
	 * Prints PI from one to five decimal places
	 */
	private static void printPI() {
		// One decimal place
		System.out.printf("%.1f\n", Math.PI);
		// Two decimal place
		System.out.printf("%.2f\n", Math.PI);
		// Three decimal place
		System.out.printf("%.3f\n", Math.PI);
		// Four decimal place
		System.out.printf("%.4f\n", Math.PI);
		// Five decimal place
		System.out.printf("%.5f\n", Math.PI);
	}

}
