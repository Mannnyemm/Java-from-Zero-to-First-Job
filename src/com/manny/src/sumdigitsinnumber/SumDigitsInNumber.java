package sumdigitsinnumber;

import java.util.Scanner;

/**
 * Program that adds absolute value of all digits in a given number
 * 
 * @author gyabe
 *
 */
public class SumDigitsInNumber {

	public static void main(String[] args) {
		// Initialize sc to Scanner
		Scanner sc = new Scanner(System.in);
		// Asks user to input an integer
		System.out.print("Please, enter integer: ");
		// Initialize number to user input
		int number = sc.nextInt();
		// Get sum of digits in number
		int sumOfDigits = sumDigitsInNumber(number);
		// Prints sumOfDigits to console
		System.out.println(sumOfDigits);
	}

	/**
	 * Adds absolute value all digits in a given number using recursion
	 * @param number Integer
	 * @return sum of digits in number
	 */
	public static int sumDigitsInNumber(int number) {
		// Base case - returns 0 if number is 0
		if (number==0) {
			return number;
		}
		// Returns sum of all digits in a number
		return Math.abs(number%10) + sumDigitsInNumber(number/10);
	}
	
	/**
	 * Adds absolute value all digits in a given number
	 * @param number Integer
	 * @return sum of digits in number
	 */
	public static int sumDigitsInNumber2(int number) {
		// Converts absolute value of number into string
		String stringOfNumber = Integer.toString(Math.abs(number));
		// Initialize result to 0
		int result = 0;
		// Loops through all characters in stringOfNumber
		for (int i=0; i<stringOfNumber.length(); i++) {
			// Converts current character to integer and add it to result
			result += Math.abs(Integer.parseInt(stringOfNumber.substring(i, i+1)));
		}
		// Return result
		return result;
	}

}
