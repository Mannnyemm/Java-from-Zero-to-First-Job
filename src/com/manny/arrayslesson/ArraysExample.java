package com.manny.arrayslesson;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array example
		int[] arr = {1, 3, 4};
		// Example of array with inner Array
		int[][] matrix = {
				{2,4,3},
				{5,6,7},
				{7,3,2},
				{8,5,9}
	};
		//Displaying Array arr
		System.out.println(Arrays.toString(arr));
		// Displays first item (nested Array) within matrix 
		System.out.println(Arrays.toString(matrix[0]));
		// Displays length of matrix
		System.out.println(matrix.length);
		// Displays length of first array(row1) matrix
		System.out.println(matrix[0].length);
		

	}

}
