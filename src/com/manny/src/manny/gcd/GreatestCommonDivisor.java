package manny.gcd;

import java.util.Scanner;

/**
 * An application to find the greatest common divisor of two numbers
 * Uses recursion based Dijkstra's Algorithm and other Algorithm
 * @author gyabe
 *
 */
public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// Initialize sc to Scanner
		Scanner sc = new Scanner(System.in);
		// Asks user to input two numbers separated by space
		System.out.print("Please, enter two numbers separated by space: ");
		// Gets user input
		String userInput = sc.nextLine();
		// Splits user input into an array
		String[] inputArgumentsArray = userInput.split("\\s+");
		// Converts first element of inputArgumentsArray to integer - number1
		int number1 = Integer.parseInt(inputArgumentsArray[0]);
		// Converts second element of inputArgumentsArray to integer - number2
		int number2 = Integer.parseInt(inputArgumentsArray[1]);
		// Prints the greatest common divisor of the two integers
		System.out.println(gcdRecursive2(number1, number2));
	}
	
	/**
	 * Returns greatest common divisor of two given integers 
	 * This function uses Dijkstra's Algorithm which says 
	 * If m>n, GCD(m,n) is the same as GCD(m-n,n) where m and n are parameters
	 * @param firstNumber Integer
	 * @param secondNumber Integer
	 * @return Integer greatest common divisor; int <= 1 is returned if
	 * both numbers has no common divisor
	 */
	public static int gcdRecursive(int firstNumber, int secondNumber) {
		// Base case - if both numbers are the same, return firstNumber
		if (firstNumber == secondNumber) {
			// Returns absolute number of results
			return Math.abs(secondNumber);
		}
		else if (firstNumber > secondNumber) {
			return gcdRecursive(firstNumber-secondNumber, secondNumber);
		}
		else {
			return gcdRecursive(firstNumber, secondNumber-firstNumber);
		}
		
	}
	/**
	 * Returns greatest common divisor of two given integers  
	 * @param firstNumber Integer
	 * @param secondNumber Integer
	 * @return Integer greatest common divisor; int <= 1 is returned if
	 * both numbers has no common divisor
	 */
	public static int gcdRecursive2(int firstNumber, int secondNumber) {
		if (secondNumber == 0) {
			// Returns absolute number of results
			return Math.abs(firstNumber); 
		} else {
			return gcdRecursive(secondNumber, firstNumber % secondNumber);
		}
	}
		

}