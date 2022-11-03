package com.manny.oop.exams.onlineshop.menu.impl;

import java.util.Scanner;

import com.manny.oop.exams.onlineshop.configs.ApplicationContext;
import com.manny.oop.exams.onlineshop.enteties.User;
import com.manny.oop.exams.onlineshop.enteties.impl.DefaultOrder;
import com.manny.oop.exams.onlineshop.menu.Menu;
import com.manny.oop.exams.onlineshop.services.OrderManagementService;
import com.manny.oop.exams.onlineshop.services.impl.DefaultOrderManagementService;

public class CheckoutMenu implements Menu {

	private ApplicationContext context;
	private OrderManagementService orderManagementService;

	{
		context = ApplicationContext.getInstance();
		orderManagementService = DefaultOrderManagementService.getInstance();
	}

	@Override
	public void start() {
		// <write your code here>
		// Displays header
		printMenuHeader();
		// Gets current user
		User user = context.getLoggedInUser();
		// If user is logged in
		if (user != null) {
			// Create a new order for user
			DefaultOrder order = new DefaultOrder(); 
			order.setCustomerId(user.getId());
			order.setProducts(context.getSessionCart().getProducts());
			// Initialize sc to Scanner
			Scanner sc = new Scanner(System.in);
			// Asks user for their credit number and 
			System.out.println("Enter your credit card number without spaces and press enter if you confirm purchase");
			String userInput = sc.next();
			// Infinite loop to keep asking user to enter a valid credit card number
			while (true) {
				// Exit loop if user's inputed credit card number is valid
				if (order.isCreditCardNumberValid(userInput)) {
					order.setCreditCardNumber(userInput);
					break;
				}
				// Asks user for their credit number and 
				System.out.println("You entered invalid credit card number. Valid credit card should contain 16 digits. Please, try one more time.");
				userInput = sc.nextLine();
			}
			// Adds current order to orders
			orderManagementService.addOrder(order);
			// Displays success message to user
			System.out.println("Thanks a lot for your purchase. Details about order delivery are sent to your email.");
		}
		// If user is not logged in
		else {
			// Displays an error message
			System.out.println("You are not logged in. Please, sign in or create new account");
		}
		
		// Redirect user to main menu
		context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		// <write your code here>
		
		// Displays header
		System.out.println("*** CHECKOUT ***");
	}

}
