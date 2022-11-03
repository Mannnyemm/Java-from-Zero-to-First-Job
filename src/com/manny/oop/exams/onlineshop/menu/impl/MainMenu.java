package com.manny.oop.exams.onlineshop.menu.impl;

import java.util.Scanner;

import com.manny.oop.exams.onlineshop.configs.ApplicationContext;
import com.manny.oop.exams.onlineshop.enteties.User;
import com.manny.oop.exams.onlineshop.menu.Menu;

public class MainMenu implements Menu {

	public static final String MENU_COMMAND = "menu";

	private static final String MAIN_MENU_TEXT_FOR_LOGGED_OUT_USER = "Please, enter number in console to proceed."
			+ System.lineSeparator()
			+ "1. Sign Up" + System.lineSeparator() + "2. Sign In"
			+ System.lineSeparator() + "3. Product Catalog" + System.lineSeparator()
			+ "4. My Orders" + System.lineSeparator() + "5. Settings" + System.lineSeparator() +
			"6. Customer List";

	private static final String MAIN_MENU_TEXT_FOR_LOGGED_IN_USER = "Please, enter number in console to proceed."
			+ System.lineSeparator()
			+ "1. Sign Up" + System.lineSeparator() + "2. Sign Out"
			+ System.lineSeparator() + "3. Product Catalog" + System.lineSeparator()
			+ "4. My Orders" + System.lineSeparator() + "5. Settings" + System.lineSeparator() +
			"6. Customer List";;

	private ApplicationContext context;

	{
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		// <write your code here>
		printMenuHeader();
		// Sets main menu in context to mainMenu
		context.setMainMenu(this);
		// Gets current user
		User currentUser = context.getLoggedInUser();
		// Displays header in console based on user's status - logged in or not
		if (currentUser instanceof User) {
			System.out.println(MAIN_MENU_TEXT_FOR_LOGGED_IN_USER);
		}
		else {
			System.out.println(MAIN_MENU_TEXT_FOR_LOGGED_OUT_USER);
		}
		// Initialize sc to Scanner
		Scanner sc = new Scanner(System.in);
		
		// Get users input
		String userInput = sc.next();
		
//		 Initialize Variable to hold integer form of userInput to 0
//		int userInputInteger = 0;
//		do {
//			// Get users input
//			String userInput = sc.next();
//			// Exit program if user inputs "exit" 
//			if (userInput.equalsIgnoreCase("exit")) {
//				return;
//			}
			
//			try {
//				userInputInteger = Integer.parseInt(userInput); 
//				if (userInputInteger  < 1 || userInputInteger > 6) {
//					System.out.println("Only 1, 2, 3, 4, 5, 6 is allowed. Try one more time.");
//					// Returns to MainMenu - task required user be returned to MainMenu if 
//					// userInput is not valid. Without this requirement program will also run fine if you comment the line below
//					start();
//				}
//			}
//			catch(NumberFormatException e){
//				System.out.println("Only 1, 2, 3, 4, 5, 6 is allowed. Try one more time.");
//				// Returns to MainMenu - task required user be returned to MainMenu if 
//				// userInput is not valid. Without this requirement program will also run fine if you comment the line below
//				start();
//			}
//		} while(userInputInteger  < 1 || userInputInteger > 6);
		
		switch (userInput.toLowerCase()) {
			case "1":
				// Initialize signUpMenu
				Menu signUpMenu = new SignUpMenu();
				// Starts sign up process
				signUpMenu.start();
				break;
			case "2": 
				// Starts login in process if user is not logged in already
				if (context.getLoggedInUser() == null) {
					// Initialize signInMenu
					Menu signInMenu = new SignInMenu();
					// Starts sign in process
					signInMenu.start();
					break;
				}
				// Signs user out if they are logged in
				else {
					// Initialize signOutMenu
					Menu signOutMenu = new SignOutMenu();
					// Starts sign out process
					signOutMenu.start();
					break;
				}
			case "3":
				// Initialize productCatalogMenu
				Menu productCatalogMenu = new ProductCatalogMenu();
				// Displays product catalog
				productCatalogMenu.start();
				break;
			case "4":
				if (context.getLoggedInUser() != null) {
					// Initialize myOrdersMenu
					Menu myOrdersMenu = new MyOrdersMenu();
					// Displays My Orders Menu
					myOrdersMenu.start();
					break;
				}
				else {
					System.out.println("Please, log in or create new account to see list of your orders");
					start();
					break;
				}
			case "5":
				if (context.getLoggedInUser() != null) {
					// Initialize settingsMenu
					Menu settingsMenu = new SettingsMenu();
					// Displays My Orders Menu
					settingsMenu.start();
					break;
				}
				else {
					System.out.println("Please, log in or create new account to see list of your orders");
					start();
					break;
				}
			case "6":
				// Initialize customerListMenu
				Menu customerListMenu = new CustomerListMenu();
				// Displays customer list
				customerListMenu.start();
				break;
			case "exit":
				// Exit program if user inputs "exit" 
				return;
			default:
				System.out.println("Only 1, 2, 3, 4, 5, 6 is allowed. Try one more time.");
				start();
		}

	}

	@Override
	public void printMenuHeader() {
		// <write your code here>
		

	}

}
