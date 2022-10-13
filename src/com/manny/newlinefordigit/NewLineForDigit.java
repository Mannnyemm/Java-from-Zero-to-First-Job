package com.manny.newlinefordigit;

import java.util.Scanner;

public class NewLineForDigit {

	public static void main(String[] args) {
		// Asks user to input an Integer
		System.out.print("Please, enter any integer: ");
		// Initialize Scanner
		Scanner sc = new Scanner(System.in);
		// Gets user input
		String userInput = sc.next();
		// Converts userInput to Array
		String[] userInputArr = userInput.split(""); 
		// Prints each digit in userInput on a seperate line using for each loop
		for (String string : userInputArr) {
			System.out.println(string);
		}

	}

}
