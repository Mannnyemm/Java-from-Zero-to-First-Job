package com.manny.addintegers;

import java.util.Scanner;

public class AddIntegers {

	public static void main(String[] args) {
//		getUserInput();
		// Converts first parameter to integer
		int firstNum = Integer.parseInt(args[0]);
		// Converts second parameter to integer
		int secondNum = Integer.parseInt(args[1]);
		// Sum of firstNum and secondNum
		int result = firstNum+secondNum;
		// Displays results
		System.out.println(firstNum + " + " + secondNum + " = " + result);
		
	}
	
	/**
	 * Function that gets input from user
	 */
	private static void getUserInput() {
		// Initialize new Scanner to sc
		Scanner sc = new Scanner(System.in);
		// Gets first input from user(string) 
		System.out.print("Please enter first number: ");
		sc.next();
		// Gets second input from user(string)
		System.out.print("Please enter second number: ");
		sc.next();
	}

}
