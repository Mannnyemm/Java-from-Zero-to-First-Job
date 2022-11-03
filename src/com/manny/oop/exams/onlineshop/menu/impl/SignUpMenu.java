package com.manny.oop.exams.onlineshop.menu.impl;

import java.util.Scanner;

import com.manny.oop.exams.onlineshop.configs.ApplicationContext;
import com.manny.oop.exams.onlineshop.enteties.impl.DefaultUser;
import com.manny.oop.exams.onlineshop.menu.Menu;
import com.manny.oop.exams.onlineshop.services.UserManagementService;
import com.manny.oop.exams.onlineshop.services.impl.DefaultUserManagementService;

public class SignUpMenu implements Menu {

	private UserManagementService userManagementService;
	@SuppressWarnings("unused")
	private ApplicationContext context;

	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		// <write your code here>
		// Displays header
		printMenuHeader();
		
		// Initialize sc
		Scanner sc = new Scanner(System.in);
		// Gets first name of user
		System.out.println("Please enter your first name: ");
		String firstName = sc.next();
		// Gets last name of user
		System.out.println("Please enter your last name: ");
		String lastName = sc.next();
		// Gets user's password
		System.out.println("Please enter a password: ");
		String password = sc.next();
		// Gets user's email
		System.out.println("Please enter your email: ");
		String email = sc.next();
		// Registers a user
		DefaultUser newUser = new DefaultUser(firstName, lastName, password, email);
		System.out.println(userManagementService.registerUser(newUser));
		// Log user in
		context.setLoggedInUser(newUser);
		// Navigates to MainMenu
		context.getMainMenu().start();
		
	}

	@Override
	public void printMenuHeader() {
		// <write your code here>
		
//		// Initialize mainMenu
//		Menu mainMenu = new MainMenu();
//		// Displays Main Menu
//		mainMenu.start();
		
		
		// Displays menu header
		System.out.println("*** SIGN UP ***");
	}

}
