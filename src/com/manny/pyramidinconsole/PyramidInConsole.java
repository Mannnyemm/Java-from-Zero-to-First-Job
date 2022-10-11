package com.manny.pyramidinconsole;

import java.util.Scanner;

public class PyramidInConsole {

	public static void main(String[] args) {
		// Initialize Scanner
		Scanner sc = new Scanner(System.in);
		// Asks user for height of pyramid
		System.out.print("Please, enter height of the pyramid: ");
        // Gets input from user
		String userInput = sc.next();
		// Converts userInput into integer
		int height = Integer.parseInt(userInput);
		// Prints pyramid if height is greater than 0
		if (height > 0) {
			for (int i = 1; i < height+1; i++) {
				for(int j = 0; j < i; j++) {					
					System.out.print("*");
				}
			System.out.print("\n");
			}
			for (int i = height-1; i > 0; i--) {
				for(int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
		}

	}

}
