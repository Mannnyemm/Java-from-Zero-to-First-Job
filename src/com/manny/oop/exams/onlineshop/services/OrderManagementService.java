package com.manny.oop.exams.onlineshop.services;

import com.manny.oop.exams.onlineshop.enteties.Order;

public interface OrderManagementService {

	void addOrder(Order order);

	Order[] getOrdersByUserId(int userId);

	Order[] getOrders();

}
