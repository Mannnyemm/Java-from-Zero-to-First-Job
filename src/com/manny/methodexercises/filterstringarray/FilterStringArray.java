package com.manny.methodexercises.filterstringarray;

import java.util.Arrays;
import java.util.Scanner;

public class FilterStringArray {

	public static void main(String[] args) {
		// Initialize sc to Scanner
		Scanner sc = new Scanner(System.in);
		// Asks user to input any word serperated by space
		System.out.print("Please, enter any words separated by space: ");
		// Gets user input
		String userInput = sc.nextLine();
		// Asks user to input minimum word length to be filtered
		System.out.print("Please, enter minumum word length to filter words: ");
		// Gets user's required length
		int minLength = sc.nextInt();
		
		// Converts userInput into array of words( String[])
		String[] words = userInput.split("\\s+");
		// Gets filtered array of words using user's minimum word length
		String[] filteredWords = filterWordsByLength(minLength, words);
		// Output filtered of words
		System.out.println(Arrays.toString(filteredWords));
	}

	
	/**
	 * Filters array of words using user's minimum word length
	 * @param minLength Integer value of minimum word length
	 * @param words String[] of words
	 * @return Filtered String[] of words with length greater than minLength
	 */
	public static String[] filterWordsByLength(int minLength, String[] words) {
		// Initialize counter to 0, holds the count of words with length greater than minLength
		int counter = 0;
		// Loops through all elements in words
		// Increase counter by 1 if word length greater than minLength
		for (String word : words) {
			// Increase counter by 1 if word length greater than minLength
			if (word.length() >= minLength) {
//				result[counter] = word;
				counter++;
			}
		}
		// Initialize result to new String Array with length of counter; 
		// Holds words with length greater minLength
		String[] results = new String[counter];
		// Initialize currIndex to 0, keeps track of current empty index of results
		int currIndex = 0;
		// Loops through all elements in words
		for (String word : words) {
			// Adds word to currIndex of result if word length greater than minLength
			if (word.length() >= minLength) {
				results[currIndex] = word;
				// Increase currIndex by 1
				currIndex++;
			}
		}
		// Return results
		return results;
	}



}
