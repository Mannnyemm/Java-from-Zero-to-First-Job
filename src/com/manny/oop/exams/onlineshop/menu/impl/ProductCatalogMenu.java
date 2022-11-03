package com.manny.oop.exams.onlineshop.menu.impl;

import java.util.Arrays;
import java.util.Scanner;

import com.manny.oop.exams.onlineshop.configs.ApplicationContext;
import com.manny.oop.exams.onlineshop.enteties.Product;
import com.manny.oop.exams.onlineshop.menu.Menu;
import com.manny.oop.exams.onlineshop.services.ProductManagementService;
import com.manny.oop.exams.onlineshop.services.impl.DefaultProductManagementService;

public class ProductCatalogMenu implements Menu {

	private static final String CHECKOUT_COMMAND = "checkout";
	private ApplicationContext context;
	private ProductManagementService productManagementService;

	{
		context = ApplicationContext.getInstance();
		productManagementService = DefaultProductManagementService.getInstance();
	}

	@Override
	public void start() {
		// <write your code here>
		
		// Displays header
		printMenuHeader();
		// Initialize sc
		Scanner sc = new Scanner(System.in);
		
		// List Products
		System.out.println(Arrays.toString(productManagementService.getProducts()));
		
		// Gets user input
		System.out.println("Enter product id to add it to the cart or 'menu' if you want to navigate back to the main menu");
		String userInput = sc.next();
		
		if (userInput.equalsIgnoreCase("menu")) {
			// Navigate to MainMenu
			context.getMainMenu().start();
		}
		else if (userInput.equalsIgnoreCase("checkout")) {
			// Display error message if cart is empty and display productCatalogMenu again
			if (context.getSessionCart().getProducts().length < 1) {
				System.out.println("Your cart is empty. Please, add product to cart first and then proceed with checkout");
				start();
			}
			// Initialize checkoutMenu
			Menu checkoutMenu = new CheckoutMenu();
			// Starts checkout process
			checkoutMenu.start();
			
		}
		else {
			try {
				// Converts user input to integer
				int userInputInteger = Integer.parseInt(userInput);
				// Gets product whose id user inputed
				Product product = productManagementService.getProductById(userInputInteger);
				// Adds product to user's cart if product is not null
				if (product != null) {
					context.getSessionCart().addProduct(product);
					System.out.printf("Product %s has been added to your cart. If you want to add a new product - enter the product id. "
							+ "If you want to proceed with checkout - enter word 'checkout' to console\n", product.getProductName());
				}
				// Displays error message if product is invalid or null
				else {
					System.out.println("Please, enter product ID if you want to add product to cart. Or enter ‘checkout’ if you want to proceed with checkout. "
							+ "Or enter 'menu' if you want to navigate back to the main menu.");
				}
			}
			// Display error message if users input cannot be converted to integer
			catch (NumberFormatException e) {
				System.out.println("Please, enter product ID if you want to add product to cart. Or enter ‘checkout’ if you want to proceed with checkout. "
						+ "Or enter 'menu' if you want to navigate back to the main menu.");;
			}
		}
		// Calls start()
		start();
	}

	@Override
	public void printMenuHeader() {
		// <write your code here>
		
		// Displays header
		System.out.println("*** PRODUCT CATALOG ***");
	}

}
