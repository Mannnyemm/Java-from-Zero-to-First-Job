package com.manny.decimaltoroman;

import java.util.Scanner;

/**
 * Application to convert roman numbers to decimals and vice versa
 * From 1 to 3999.
 * @author gyabe
 *
 */
public class ConvertDecimalToRoman {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		mainLoop: while (true) {
			System.out.print("Please, select mode. If you want to convert Roman "
					+ "numbers to decimal - type 'R2D' and press enter."
					+ System.lineSeparator()
					+ "If you want to convert decimal numbers to Roman - type 'D2R' and press enter: ");

			String mode = sc.next();
			if (mode.equalsIgnoreCase("R2D")) {
				while (true) {
					System.out.print("Please, enter Roman number you want to convert: ");
					String romanNumber = sc.next();
					if (isRomanNumberValid(romanNumber)) {
						System.out.println(roman2Decimal(romanNumber));
						break mainLoop;
					} else {
						System.out.println("You entered invalid Roman number. "
								+ "Please, try one more time.");
						continue;
					}
				}
			} else if (mode.equalsIgnoreCase("D2R")) {
				while (true) {
					System.out.print("Please, enter decimal number "
							+ "you want to convert: ");
					int decimalNumber = sc.nextInt();
					if (isDecimalNumberValid(decimalNumber)) {
						System.out.println(decimal2Roman(decimalNumber));
						break mainLoop;
					} else {
						System.out.println("Please, enter positive integer from 1 to 100.");
						continue;
					}

				}

			}
			
			System.out.println("Please, enter 'R2D' or 'D2R.");
		}
	}

	

	/**
	 * Converts decimal numbers to Roman.
	 * 
	 * Takes int value as a parameter. Assignment required it to Works only with numbers from 1 to 100.
	 * But i expanded it to work with the maximum decimal value of 3999.
	 * 
	 * @param number to convert to Roman.
	 * @return string of Roman number.
	 */
	public static String decimal2Roman(int number) {
		if (number == 0) return "";
		else if(number >= 1000) {
			return "M" + decimal2Roman(number - 1000);
		}
		else if (number >= 900) {
			return "CM" + decimal2Roman(number - 900);
		}
		else if (number >= 500) {
			return "D" + decimal2Roman(number - 500);
		}
		else if (number >= 400) {
			return "CD" + decimal2Roman(number - 400);
		}
		else if (number >= 100) {
			return "C" + decimal2Roman(number - 100);
		}
		else if (number >= 90) {
			return "XC" + decimal2Roman(number - 90);
		}
		else if (number >= 50) {
			return "L" + decimal2Roman(number - 50);
		}
		else if(number >= 40) {
			return "XL" + decimal2Roman(number - 40);
		}
		else if (number >= 10) {
			return "X" + decimal2Roman(number - 10);
		}
		else if (number == 9) {
			return "IX" + decimal2Roman(number - 9);
		}
		else if (number >= 5) {
			return "V" + decimal2Roman(number - 5);
		}
		else if (number == 4) {
			return "IV" + decimal2Roman(number - 4);
		}
		else {
			return "I" + decimal2Roman(number-1);
		}
		
	}

	/**
	 * Converts Roman numbers to decimal.
	 * 
	 * Takes string value with Roman number as a parameter.
	 * 
	 * At first method validates if input string could be Roman number. After method
	 * uses algorithm to convert Roman numeral to decimal.
	 * 
	 * @param romanNumber
	 * @return decimal representation of Roman number
	 */

	public static int roman2Decimal(String romanNumber) {
		int romanstrLength = romanNumber.length();
		if (romanNumber.equalsIgnoreCase("")) {
			return 0;
		}
		else if (romanstrLength > 1 && romanNumber.substring(romanstrLength - 2).equalsIgnoreCase("CM")) {
			return 900 + roman2Decimal(romanNumber.substring(0, romanstrLength- 2));
		}
		else if (romanNumber.substring(romanstrLength- 1).equalsIgnoreCase("M")) {
			return 1000 + roman2Decimal(romanNumber.substring(0, romanstrLength- 1));
		}
		else if (romanstrLength > 1 && romanNumber.substring(romanstrLength- 2).equalsIgnoreCase("CD")) {
			return 400 + roman2Decimal(romanNumber.substring(0, romanstrLength- 2));
		}
		else if (romanNumber.substring(romanstrLength- 1).equalsIgnoreCase("D")) {
			return  500 + roman2Decimal(romanNumber.substring(0, romanstrLength- 1));
		}
		else if (romanstrLength > 1 && romanNumber.substring(romanstrLength- 2).equalsIgnoreCase("XC")) {
			return 90 + roman2Decimal(romanNumber.substring(0, romanstrLength- 2));
		}
		else if (romanNumber.substring(romanstrLength- 1).equalsIgnoreCase("C")) {
			return 100 + roman2Decimal(romanNumber.substring(0, romanstrLength- 1));
		}
		else if(romanstrLength > 1 && romanNumber.substring(romanstrLength- 2).equalsIgnoreCase("XL")) {
			return 40 + roman2Decimal(romanNumber.substring(0, romanstrLength- 2));
		}
		else if (romanNumber.substring(romanstrLength- 1).equalsIgnoreCase("L")) {
			return 50 + roman2Decimal(romanNumber.substring(0, romanstrLength- 1));
		}
		else if (romanstrLength > 1 && romanNumber.substring(romanstrLength- 2).equalsIgnoreCase("IX")) {
			return 9 + roman2Decimal(romanNumber.substring(0, romanstrLength- 2));
		}
		else if (romanNumber.substring(romanstrLength- 1).equalsIgnoreCase("X")) {
			return 10 + roman2Decimal(romanNumber.substring(0, romanstrLength- 1));
		}
		else if (romanstrLength > 1 && romanNumber.substring(romanstrLength- 2).equalsIgnoreCase("IV")) {
			return 4 + roman2Decimal(romanNumber.substring(0, romanstrLength- 2));
		}
		else if (romanNumber.substring(romanstrLength- 1).equalsIgnoreCase("V")) {
			return 5 + roman2Decimal(romanNumber.substring(0, romanstrLength- 1));
		}
		else {
			return 1 + roman2Decimal(romanNumber.substring(0, romanstrLength- 1));
					}
	}


	/**
	 * Validation for Roman numbers.
	 * 
	 * Use regular expression which is checking if string really could be Roman
	 * number.
	 * 
	 * @param romanNumber
	 * @return true if String is Roman number
	 */
	public static boolean isRomanNumberValid(String romanNumber) {
		String regexText = "^(?i)M{0,3}(D?C{0,3}|C[DM])(L?X{0,3}|X[LC])(V?I{0,3}|I[VX])$";
		return romanNumber.matches(regexText);
	}
	
	public static boolean isDecimalNumberValid(int decimalNumber) {
		if (decimalNumber < 4000 && decimalNumber > 0) {
			return true;
		}
		return false;
	}
}