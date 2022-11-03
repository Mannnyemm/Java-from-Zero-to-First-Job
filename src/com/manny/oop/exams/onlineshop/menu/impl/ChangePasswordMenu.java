package com.manny.oop.exams.onlineshop.menu.impl;

import java.util.Scanner;

import com.manny.oop.exams.onlineshop.configs.ApplicationContext;
import com.manny.oop.exams.onlineshop.menu.Menu;

public class ChangePasswordMenu implements Menu {

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
		// Asks user for new password
		System.out.println("Please enter your new password");
		String userInput = sc.next();
		// Changes user's password
		context.getLoggedInUser().setPassword(userInput);
		// Display success message
		System.out.println("Your password has been successfully changed");
		// Redirect to Main menu
		context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		// <write your code here>
		
		// Displays header
		System.out.println("*** CHANGE PASSWORD ***");
	}

}
