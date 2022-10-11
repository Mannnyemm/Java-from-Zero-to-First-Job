package com.manny.printmatrixtoconsole;

public class PrintMatrixToConsole {

	public static void main(String[] args) {
		// Integer Matrix
		int[][] matrix = {
				{1, 2, 3, 4, 5,},
				{6, 7},
				{8, 9, 10}
		};
		
		// Loops through rows in matrix
		for (int[] row : matrix) {
			// Loops through columns in current row
			for (int column : row) {
				// Prints current column in current row with space without moving to new line 
				System.out.print(column + " ");
			}
			// Moves cursor to new line for next row
			System.out.print("\n");
		}

	}

}
