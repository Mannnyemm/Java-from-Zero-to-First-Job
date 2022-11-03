package com.manny.oop.exams.onlineshop.services.impl;

import java.util.Arrays;

import com.manny.oop.exams.onlineshop.enteties.Order;
import com.manny.oop.exams.onlineshop.enteties.User;
import com.manny.oop.exams.onlineshop.services.OrderManagementService;

public class DefaultOrderManagementService implements OrderManagementService {

	private static final int DEFAULT_ORDER_CAPACITY = 10;

	private static DefaultOrderManagementService instance;

	// <write your code here>
	
	// Array of orders
	private Order[] orders;
	// First index of orders array where an order has not been inserted
	private int firstAvailableIndex = 0;
	// Initialize orders array to Default order capacity
	{
		orders = new Order[DEFAULT_ORDER_CAPACITY];
	}

	public static OrderManagementService getInstance() {
		if (instance == null) {
			instance = new DefaultOrderManagementService();
		}
		return instance;
	}

	/**
	 *  Adds an order to orders array
	 *  @param order Order - order to add
	 */
	@Override
	public void addOrder(Order order) {
		// <write your code here>
		// Exit method if order is null
		if (order == null) {
			return;
		}
		// Double size of orders array if it's full
		if (orders.length <= firstAvailableIndex) {
			orders = Arrays.copyOf(orders, orders.length << 1);
		}
		// Add order to orders array
		orders[firstAvailableIndex++] = order;
	}

	/** 
	 * Return orders by a specific userId
	 * @param userId Integer - id of user's whose orders we want
	 * @return Order[] or null - array of specified users orders or null if user has no orders
	 */
	@Override
	public Order[] getOrdersByUserId(int userId) {
		// <write your code here>
		// Initialize length of array to hold specified user orders to total non null orders
		Order[] userIdOrders = new Order[firstAvailableIndex];
		// First index of userIdOrders array where an order has not been inserted
		int currIndex = 0;
		// Loop through all non null orders
		for (Order order : this.getOrders()) {
			// Adds an order to userIdOrders if it was made by specified userId
			if (order.getCustomerId() == userId) {
				userIdOrders[currIndex++] = order;
			}
		}
		if (currIndex == 0) {
			return null;
		}
		return Arrays.copyOf(userIdOrders, currIndex);
	}

	/**
	 *  Return non null orders
	 *  @return Order[] - array of all non null orders
	 */
	@Override
	public Order[] getOrders() {
		// <write your code here>
		// Return a copy of orders array excluding null orders
		return Arrays.copyOf(orders, firstAvailableIndex);
	}

	void clearServiceState() {
		// <write your code here>
		
		// Resets orders array to default
		orders = new Order[DEFAULT_ORDER_CAPACITY];
		firstAvailableIndex = 0;
	}

}
