package com.manny.methodexercises.matrixrotation;

import java.util.Scanner;

/**
 * A program that generates and rotate a matrix
 *  with a users given inputs
 *  
 * @author gyabe
 *
 */
public class MatrixRotation {

	public static void main(String[] args) {
		// Initialize in to Scanner
		Scanner in = new Scanner(System.in);
		// Asks user to input Size of matrix, assignment required square matrixes only
		System.out.print("Please, enter matrix size: ");
		int size = in.nextInt();
		// Generates matrix
		double[][] matrix = generateMatrix(size);
		
		/**
		 *  Code to allow user to generate all kinds of matrixes; personal extension of assignment
		//		// Asks user to input number of rows of matrix
		//		System.out.print("Please, enter matrix size: ");
		//		int row = in.nextInt();
		//		// Asks user to input number of columns of matrix
		//		System.out.print("Please, enter matrix size: ");
		//		int column = in.nextInt();
		//		// Generates matrix
		// 	    double[][] matrix = generateMatrix(row, column);
		 * 
		 */

		// Asks user to choose how they want the matrix rotated
		System.out.println("How you want to rotate matrix:" + System.lineSeparator() +
				"\t1 - 90" + System.lineSeparator() +
				"\t2 - 180" + System.lineSeparator() +
				"\t3 - 270");
		int mode = in.nextInt();

		// Prints generated matrix before it being rotated
		System.out.println(System.lineSeparator() + "Base matrix:" + System.lineSeparator());
		printMatrixToConsole(matrix);
		System.out.println();

		//		Prints rotated matrix if user inputed correct options; Assignment required
		if (rotateMatrix(matrix, mode)) {
			printMatrixToConsole(matrix);
		}
	}
	
	/**
	 * Checks if user has chosen correct rotation mode
	 * And performs user's desired rotation
	 * @param matrix Matrix to be rotated
	 * @param mode Rotation mode; 1 - 90, 2- 180, 3 - 270
	 * @return true if user chose a correct rotation mode else false
	 */
	public static boolean rotateMatrix(double[][] matrix, int mode) {
		// Initialize return to false
		boolean result = false;
		// Rotate matrix by 90 degrees and set result to true if mode is 1
		if (mode == 1) {
			rotate90(matrix);
			result = true;
		}
		// Rotate matrix by 180 degrees and set result to true if mode is 2
		else if (mode == 2) {
			rotate180(matrix);
			result = true;
		}
		// Rotate matrix by 270 degrees and set result to true if mode is 3
		else if (mode == 3) {
			rotate270(matrix);
			result = true;
		}
		// Return result
		return result;
	}
	/**
	 * Changes orignalMatrix values to newMatrix values
	 * This function must be used for only squared matrixes, as Exercise required
	 * For all other matrixes don't call this function since rows and columns of originalMatrix may be
	 * shorter than newMatirx leading to index out of Bound exception
	 * 
	 * @param originalMatrix Initial matrix before rotation
	 * @param newMatrix New matrix after rotation
	 */
	private static void rotateOriginalMatrix(double[][] originalMatrix, double[][] newMatrix) {
		//	originalMatrix = newMatrix.length;
		// Empty Array
		double emptyRow[] = {};
		// Runs loop through rows in originalMatrix
		for (int row = 0; row < originalMatrix.length; row++) {
			// Replaces originalMatrix row with row in newMatrix at same index if newMatrix has a row at that index
			if (row < newMatrix.length) {
				originalMatrix[row] = newMatrix[row];
			}
			// Else change current row in originalMatrix to emptyRow 
			else {
				originalMatrix[row] = emptyRow;
			}
		}
	}
	
	/**
	 * Generates a 'double[][]' matrix(nested array) with rows rowSize and columns colSize.
	 * This is an extension of Exercise task by me to allow generation of non-squared matrixes
	 * @param rowSize Integer of number of rows matrix should have
	 * @param colSize Integer of number of columns matrix should have
	 * @return double[][] Generated matrix
	 */
	public static double[][] generateMatrix(int rowSize, int colSize) {
		// Initialize generatedMatrix to an empty matrix with rows rowSize and columns colSize
		double[][] generatedMatrix = new double[rowSize][colSize];
		insertValuesIntoMatrix(rowSize, colSize, generatedMatrix);
		// Return generatedMatrix
		return generatedMatrix;
	}
	/**
	 * Generates a  'double[][]' squared matrix(nested array) with rows and columns size.
	 * @param size Integer number of rows and columns of  a matrix
	 * @return double[][] Generated matrix
	 */
	public static double[][] generateMatrix(int size) {
		// Initialize generatedMatrix to an empty squared matrix with rows and columns size
		double[][] generatedMatrix = new double[size][size];
		insertValuesIntoMatrix(size, size, generatedMatrix);
		// Return generatedMatrix
		return generatedMatrix;
	}

	/**
	 * Inserts values into a given matrix of type double[][] where
	 * Each value of an element is a one decimal place double. // E.g. 1.0 where 1 and 0 represent the row and column (position) 
	 * of current element respectively.
[	 * @param rowSize Integer of number of rows in matrix 
	 * @param colSize Integer of number of columns in matrix 
	 * @param generatedMatrix double[][] of matrix to be filled with values
	 */
	private static void insertValuesIntoMatrix(int rowSize, int colSize, double[][] generatedMatrix) {
		// Runs a loop through rows of matrix
		for (int row = 0; row < rowSize; row++) {
			// Runs a loop through columns of matrix
			for (int column = 0; column < colSize; column++) {
				// Initialize value of current element to a one decimal place double.
				// E.g. 1.0 where 1 and 0 represent the row and column (position) of current element respectively.
				generatedMatrix[row][column] = row + (column/10.0);
			}
		}
	}
	/**
	 * Prints or displays a given matrix to console
	 * @param matrix double[][] matrix to be printed
	 */
	public static void printMatrixToConsole(double matrix[][]) {
		// Runs a loop through rows of matrix
		for (double[] row : matrix) {
			// Runs a loop through columns of matrix
			for (double column : row) {
				// Prints all elements of current row on same line
				System.out.print(column + " ");
			}
			// Moves cursor to the next line if current row is not empty
			if (row.length > 0) {
				
				System.out.print(System.lineSeparator());
			}
		}
	}
	/**
	 * Rotates a given matrix 90 degrees 
	 * NB: Only for square matrix
	 * @param matrix double[][] matrix to be rotated
 	 */
	public static void rotate90(double[][] matrix) {
		/*
		* Performs rotation in a  new  matrix and later changes originalMatrix to the rotatedMatrix
		*/
		int lengthOfOldColumns = matrix[0].length;
		int lengthOfOldRows = matrix.length;
		// Variable to hold the rotated Matrix
		double[][] rotatedMatrix = new double[lengthOfOldColumns][lengthOfOldRows];
		
		for (int row = 0; row < lengthOfOldColumns; row++) {
			for (int column = 0; column < lengthOfOldRows; column++) {
				rotatedMatrix[row][column] = matrix[lengthOfOldRows-1-column][row];
			}
		}
		// Changes initial Matrix to the rotatedMatrix
		rotateOriginalMatrix(matrix, rotatedMatrix);
		
	}
	/**
	 * Rotates a given matrix 180 degrees 
	 * NB: Only for square matrix
	 * @param matrix double[][] matrix to be rotated
	 */
	public static void rotate180(double[][] matrix) {
		/*
		* Performs rotation in a  new  matrix and later changes originalMatrix to the rotatedMatrix
		*/			
		int lengthOfOldColumns = matrix[0].length;
	    int lengthOfOldRows = matrix.length;
		// Variable to hold the rotated Matrix
		double[][] rotatedMatrix = new double[lengthOfOldRows][lengthOfOldColumns];
		
		for (int row = 0; row < lengthOfOldRows; row++) {
			for (int column = 0; column < lengthOfOldColumns; column++) {
				rotatedMatrix[row][column] = matrix[lengthOfOldRows-1-row][lengthOfOldColumns-1-column];
			}
		}
		// Changes initial Matrix to the rotatedMatrix
		rotateOriginalMatrix(matrix, rotatedMatrix);
	}

	/**
	 * Rotates a given matrix 270 degrees 
	 * NB: Only for square matrix
	 * @param matrix double[][] matrix to be rotated
	 */
	public static void rotate270(double[][] matrix) {
		/*
		* Performs rotation in a  new  matrix and later changes originalMatrix to the a new matrix rotatedMatrix
		*/
		int lengthOfOldColumns = matrix[0].length;
		int lengthOfOldRows = matrix.length;
		// Variable to hold the rotated Matrix
		double[][] rotatedMatrix = new double[lengthOfOldColumns][lengthOfOldRows];
		
		for (int row = 0; row < lengthOfOldColumns; row++) {
			for (int column = 0; column < lengthOfOldRows; column++) {
				rotatedMatrix[row][column] = matrix[column][lengthOfOldColumns - 1 - row];
			}
		}
		// Changes initial Matrix to the rotatedMatrix		rotateOriginalMatrix(matrix, rotatedMatrix);
	}	
	/**
	 * Rotates a given matrix 90 degrees and returns a new matrix rotatedMatrix
	 * @param matrix double[][] matrix to be rotated
 	 * @return double[][] rotated matrix
	 */
	public static double[][] rotate90WithReturnValue(double[][] matrix) {
		int lengthOfOldColumns = matrix[0].length;
		int lengthOfOldRows = matrix.length;
		// Variable to hold the rotated Matrix
		double[][] rotatedMatrix = new double[lengthOfOldColumns][lengthOfOldRows];
		
		for (int row = 0; row < lengthOfOldColumns; row++) {
			for (int column = 0; column < lengthOfOldRows; column++) {
				rotatedMatrix[row][column] = matrix[lengthOfOldRows-1-column][row];
			}
		}
		// Returns rotated matrix
		return rotatedMatrix;		
	}
	/**
	 * Rotates a given matrix 180 degrees and returns a new matrix rotatedMatrix
	 * @param matrix double[][] matrix to be rotated
 	 * @return double[][] rotated matrix
	 */
	public static double[][] rotate180WithReturnValue(double[][] matrix) {			
		int lengthOfOldColumns = matrix[0].length;
	    int lengthOfOldRows = matrix.length;
	    // Variable to hold the rotated Matrix
		double[][] rotatedMatrix = new double[lengthOfOldRows][lengthOfOldColumns];
		
		for (int row = 0; row < lengthOfOldRows; row++) {
			for (int column = 0; column < lengthOfOldColumns; column++) {
				rotatedMatrix[row][column] = matrix[lengthOfOldRows-1-row][lengthOfOldColumns-1-column];
			}
		}
		// Returns rotated matrix		return rotatedMatrix;
	}
	/**
	 * Rotates a given matrix 270 degrees and returns rotatedMatrix
	 * @param matrix double[][] matrix to be rotated
 	 * @return double[][] rotated matrix
	 */
	public static double[][] rotate270WithReturnValue(double[][] matrix) {
		int lengthOfOldColumns = matrix[0].length;
		int lengthOfOldRows = matrix.length;
		// Variable to hold the rotated Matrix
		double[][] rotatedMatrix = new double[lengthOfOldColumns][lengthOfOldRows];
		
		for (int row = 0; row < lengthOfOldColumns; row++) {
			for (int column = 0; column < lengthOfOldRows; column++) {
				rotatedMatrix[row][column] = matrix[column][lengthOfOldColumns - 1 - row];
			}
		}
		// Returns rotated matrix
		return rotatedMatrix;
	}

}
