package com.manny.oop.exams.onlineshop.menu.impl;

import java.util.Scanner;

import com.manny.oop.exams.onlineshop.configs.ApplicationContext;
import com.manny.oop.exams.onlineshop.menu.Menu;

public class SettingsMenu implements Menu {

	private static final String SETTINGS = "1. Change Password" + System.lineSeparator()
			+ "2. Change Email";

	private ApplicationContext context;

	{
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		// <write your code here>
		
		// Displays header
		printMenuHeader();
		// Initialize sc to Scanner
		Scanner sc = new Scanner(System.in);
		// Gets user input
		System.out.println(SETTINGS);
		String userInput = sc.next();
//		if (!userInput.equals("1")|| !userInput.equals("2")) {
//			start();
//		}
		switch (userInput.toLowerCase()) {
		case "1":
			// Initialize changePasswordMenu
			Menu changePasswordMenu = new ChangePasswordMenu();
			// Start change password process
			changePasswordMenu.start();
			break;
		case "2":
			// Initialize changeEmailMenu
			Menu changeEmailMenu = new ChangeEmailMenu();
			// Start change email process
			changeEmailMenu.start();
			break;
		case "menu":
			// Display main menu
			context.getMainMenu().start();
			break;
		default:
			System.out.println("Only 1, 2 is allowed. Try one more time");
			start();
		}
	}

	@Override
	public void printMenuHeader() {
		// <write your code here>
		
		// Displays header
		System.out.println("*** SETTINGS ***");
	}

}
