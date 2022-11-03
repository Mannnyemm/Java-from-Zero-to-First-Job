package com.manny.oop.exams.onlineshop.enteties.impl;

import java.util.Arrays;


import com.manny.oop.exams.onlineshop.enteties.Cart;
import com.manny.oop.exams.onlineshop.enteties.Product;


public class DefaultCart implements Cart {

	// <write your code here>
	
	private final int DEFAULT_PRODUCTS_IN_CART = 10;
	// Array of products
	Product[] products;
	// First index of products array where an order has not been inserted
	private int firstAvailableIndex = 0;
	// Initialize length of products array to DEFAULT_USERS_CAPACITY
	{
		products = new Product[DEFAULT_PRODUCTS_IN_CART];
	}

	@Override
	public boolean isEmpty() {
		// <write your code here>

		// Checks if length of non null products in products array is equal to 0 or not
		return getProducts().length == 0;
	}

	@Override
	public void addProduct(Product product) {
		// <write your code here>
		
		// Exit function if all parameters are not satisfied
		if (product == null) {
			return;
		}
		
		// Double size of products array if it's full
		if (products.length <= firstAvailableIndex) {
			products = Arrays.copyOf(products, products.length << 1);
		}
		// Add product to products array
		products[firstAvailableIndex++] = product;
	}

	@Override
	public Product[] getProducts() {
		// <write your code here>

		// Return non null products in products array
		return Arrays.copyOf(products, firstAvailableIndex);
	}

	@Override
	public void clear() {
		// <write your code here>
		
		// Resets products array to default 
		products = new Product[DEFAULT_PRODUCTS_IN_CART];
		firstAvailableIndex = 0;
	}

}
