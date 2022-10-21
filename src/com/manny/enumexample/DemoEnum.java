package com.manny.enumexample;

import java.util.Scanner;

public class DemoEnum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Please, enter message type to check it priority: ");
			String userInput = sc.next();
		
			if (isValidMessageType(userInput)) {
				// Initialize message to MessageType of value userInput
				MessageType message = MessageType.valueOf(userInput.toUpperCase());
				// Prints message's priority
				System.out.println(message.getPriority());
				break;
			} 
			else {
				System.out.println("Please, enter valid "
						+ "message type. Only 'A', 'B', 'C' or 'D' are allowed");
					continue;
			}
		}
	}
	
	/**
	 * Checks if userInput is valid
	 * @param userInput String
	 * @return true or false if user input is valid or invalid respectively
	 */
	private static boolean isValidMessageType(String userInput) {
		// Returns true if user input is valid
		if (userInput.matches("(?i)^[ABCD]$")) {
			return true;
		}
		// Else Returns false
		return false;
	}

}
