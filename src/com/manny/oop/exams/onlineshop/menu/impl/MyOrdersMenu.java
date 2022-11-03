package com.manny.oop.exams.onlineshop.menu.impl;

import java.util.Arrays;

import com.manny.oop.exams.onlineshop.configs.ApplicationContext;
import com.manny.oop.exams.onlineshop.enteties.Order;
import com.manny.oop.exams.onlineshop.menu.Menu;
import com.manny.oop.exams.onlineshop.services.OrderManagementService;
import com.manny.oop.exams.onlineshop.services.impl.DefaultOrderManagementService;

public class MyOrdersMenu implements Menu {

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
		// Gets a user's orders
		Order[] ordersByUserId = orderManagementService.getOrdersByUserId(context.getLoggedInUser().getId());
		// Display users orders if it's not empty
		if (ordersByUserId != null) {
			System.out.println(Arrays.toString(ordersByUserId));
		}
		// Display error message if user has no orders
		else {
			System.out.println("Unfortunately, you don’t have any orders yet. Navigate back to main menu to place a new order");
		}
		// Redirect to Main menu
		context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		// <write your code here>
		
		// Displays header
		System.out.println("*** MY ORDERS ***");
	}

}
