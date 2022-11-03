package com.manny.oop.exams.onlineshop.menu.impl;

import java.util.Arrays;

import com.manny.oop.exams.onlineshop.configs.ApplicationContext;
import com.manny.oop.exams.onlineshop.menu.Menu;
import com.manny.oop.exams.onlineshop.services.UserManagementService;
import com.manny.oop.exams.onlineshop.services.impl.DefaultUserManagementService;

public class CustomerListMenu implements Menu {

	private ApplicationContext context;
	private UserManagementService userManagementService;

	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		// <write your code here>
		
		// Displays header
		printMenuHeader();
		// Display list of users excluding their passwords
		System.out.println(Arrays.toString(userManagementService.getUsers()));
		// Redirect to Main menu
		context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		// <write your code here>
		
		// Displays header
		System.out.println("*** CUSTOMER LIST ***");
	}

}
