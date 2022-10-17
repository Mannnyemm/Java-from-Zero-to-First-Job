package com.manny.fcc.recursion;

/**
 * An application I used to practice recursion 
 * while watching a video from Free Code Camp
 * @author gyabe
 *
 */
public class FCCRecursion {

	public static void main(String[] args) {
		String text = "Hello World";
		String result = reverseString(text, text.length());
		System.out.println(result);
		String result2 = reverseString(result);
		System.out.println(result2);
		System.out.println(decToBin(233));
		
	}

	/**
	 * Recursively reverses a given string text
	 * @param text String
	 * @param textLength Integer
	 * @return reversed String of Text
	 */
	public static String reverseString(String text, int textLength) {
		if (textLength == 1) {
			return text.substring(textLength-1, textLength);
		}
		return text.substring(textLength-1, textLength) + reverseString(text, textLength-1);
	}
	/**
	 * Recursively reverses a given string text
	 * @param text String
	 * @return reversed String of Text
	 */
	public static String reverseString(String text) {
		if (text.isEmpty()) {
			return text;
		}
		return text.substring(text.length()-1) + reverseString(text.substring(0, text.length()-1));
		
	}
	/**
	 * Recursively convert decimal to Binary
	 * @param decimal
	 * @return
	 */
	public static String decToBin(int decimal) {
		if (decimal == 0 || decimal ==1) {
			return Integer.toString(decimal);
		}
		return decToBin(decimal/2) + Integer.toString(decimal % 2);
	}
}
