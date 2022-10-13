package com.manny.methodexercises.amountofwords;

import java.util.Scanner;

public class AmountOfWords {

	public static void main(String[] args) {
		// Initialize sc to scanner
		Scanner sc = new Scanner(System.in);
		// Asks user to input a text
		System.out.print("Please, enter any text: ");
	    // Gets user's input
		String userInput = sc.nextLine();
	    // Number of words in user's text
	    int amountOfWords = getWordsAmount(userInput);
	    // Displays number of words in user's text to console
		System.out.println("Amount of words in your text: " + amountOfWords);
	}

	/**
	 * Returns number of words in a given string
	 * @param text A string
	 * @return number of words in text
	 */
	public static int getWordsAmount(String text) {
		// Returns number of words
		return text.split("[^\\w]+").length;
	}

}
