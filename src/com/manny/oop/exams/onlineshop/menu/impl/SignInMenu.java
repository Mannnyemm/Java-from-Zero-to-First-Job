package com.manny.oop.exams.onlineshop.menu.impl;

import com.manny.oop.exams.onlineshop.configs.ApplicationContext;
import com.manny.oop.exams.onlineshop.enteties.User;
import com.manny.oop.exams.onlineshop.menu.Menu;
import com.manny.oop.exams.onlineshop.services.UserManagementService;
import com.manny.oop.exams.onlineshop.services.impl.DefaultUserManagementService;
import java.util.Scanner;
public class SignInMenu implements Menu {

	private ApplicationContext context;
	private UserManagementService userManagementService;

	{
		context = ApplicationContext.getInstance();
		userManagementService = DefaultUserManagementService.getInstance();
	}

	@Override
	public void start() {
		// <write your code here>
		
		// Displays header
		printMenuHeader();
		// Initialize sc
		Scanner sc = new Scanner(System.in);
		// Gets user's email
		System.out.println("Please enter your email: ");
		String email = sc.next();
		// Gets user's password
		System.out.println("Please enter a password: ");
		String password = sc.next();
		// Validate login details
		User user = userManagementService.getUserByEmail(email);
		if (user == null || !user.getPassword().equals(password)) {
			System.out.println("Unfortunately, such login and password doesn’t exist");
		}
		else {
			context.setLoggedInUser(user);
			System.out.printf("Glad to see you back %s %s\n", user.getFirstName(), user.getLastName());
		}
		// Displays Main Menu
		context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		// <write your code here>

		
		// Displays menu header
		System.out.println("*** SIGN IN ***");
	}

}
