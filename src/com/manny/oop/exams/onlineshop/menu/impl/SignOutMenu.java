package com.manny.oop.exams.onlineshop.menu.impl;

import com.manny.oop.exams.onlineshop.configs.ApplicationContext;
import com.manny.oop.exams.onlineshop.menu.Menu;

public class SignOutMenu implements Menu {

	private ApplicationContext context;

	{
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		// <write your code here>
		
		// Displays header
		printMenuHeader();
		// Displays sign out message
		System.out.println("Have a nice day! Look forward to welcoming back!");
		// Sign a user out
		context.setLoggedInUser(null);
		// Displays Main Menu
		context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		// <write your code here>
		
		
		// Displays menu header
		System.out.println("*** SIGN OUT ***");
	}

}
