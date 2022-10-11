package com.manny.switchexample;

import java.util.Scanner;

public class UserActivitySelector {

	public static void main(String[] args) {
		// Inform user to choose from possible events
		System.out.println("Please enter one of the following: login, sign_up,"
				+ "terminate_program, main_menu, about_app");
		// Initialize Scanner
		Scanner sc = new Scanner(System.in);
		// Gets user input from 
		String userInput = sc.next();
		// Print to console based on userInput
		switch (userInput) {
			// If userInput is login
			case "login":
				System.out.println("Please, enter your username");
				break;
			// If userInput is sign_up
			case "sign_up":
				System.out.println("Welcome!");
				break;
			// If userInput is terminate_program
			case "terminate_program":
				System.out.println("Thank you! Good bye!");
				break;
			// If userInput is main_menu
			case "main_menu":
				System.out.println("Main Menu");
				break;
			// If userInput is about_app
			case "about_app":
				System.out.printf("This app is created by me with support of \u00aeIT-Bulls.com");
				break;
			// If userInput is none of the above
			default:
				System.out.println("Please, enter one of these values: login, sign_up, terminate_program"
						+ " main_menu, about_app");
				break;
		}

	}

}
