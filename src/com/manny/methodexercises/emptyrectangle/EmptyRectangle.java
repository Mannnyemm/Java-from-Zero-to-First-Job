package com.manny.methodexercises.emptyrectangle;

import java.util.Scanner;

public class EmptyRectangle {

	public static void main(String[] args) {
		// Initialize sc to Scanner
		Scanner sc = new Scanner(System.in);
		// Ask user to enter height of rectangle
		System.out.print("Please, enter height of rectangle: ");
		// Initialize height to user input
		int height = sc.nextInt();
		// Ask user to enter width of rectangle
		System.out.print("Please, enter width of rectangle: ");
		// Initialize width to user input
		int width = sc.nextInt();
		// Draws rectangle with user's inputed height and witdth
		drawRectangle(height, width);
	}

	/**
	 * Prints empty rectangle with a given height and width 
	 * @param height Integer value representing height of rectangle
	 * @param width  Integer value representing width of rectangle
	 */
	public static void drawRectangle(int height, int width) {
		// Runs a loop from 0 to height of rectangle
		for (int h = 0; h< height; h++) {
			// Print full width represented by * at the top and bottom side of rectangle
			if (h==0 || h == height -1) {
				for (int w = 0; w < width;w++) {
					System.out.print("*");
				}
			}
			// Else Print * at the the left and right side of rectangle
			else {
				for (int w = 0; w < width;w++) {
					if (w == 0 || w == width-1) {						
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			// Moves cursor to a new line
			System.out.print("\n");
		}
	}
}
