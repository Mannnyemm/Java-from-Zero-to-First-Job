package com.manny.oop.exams.onlineshop.enteties.impl;

import java.util.Arrays;

import com.manny.oop.exams.onlineshop.enteties.Order;
import com.manny.oop.exams.onlineshop.enteties.Product;

public class DefaultOrder implements Order {

	private static final int AMOUNT_OF_DIGITS_IN_CREDIT_CARD_NUMBER = 16;

	private String creditCardNumber;
	private Product[] products;
	private int customerId;

	// Simple Credit Card validator
	@Override
	public boolean isCreditCardNumberValid(String creditCardNumber) {
		// <write your code here>
		
		// Exam required this
//		return creditCardNumber.length() == AMOUNT_OF_DIGITS_IN_CREDIT_CARD_NUMBER && 
//				!creditCardNumber.contains(" ") && Long.parseLong(creditCardNumber) > 0;
		try {
			// Checks if credit number values are digits only
			Long.parseLong(creditCardNumber);
		}
		catch (NumberFormatException e) {
			return false;
		}
		return creditCardNumber.length() == AMOUNT_OF_DIGITS_IN_CREDIT_CARD_NUMBER;
	}

	// Sets creditCard Number
	@Override
	public void setCreditCardNumber(String creditCardNumber) {
		// <write your code here>
		this.creditCardNumber = creditCardNumber;
	}

	// Sets products array
	@Override
	public void setProducts(Product[] products) {
		// <write your code here>
		this.products = products;
	}

	// Sets a customerId 
	@Override
	public void setCustomerId(int customerId) {
		// <write your code here>
		this.customerId = customerId;
	}

	// Returns customerId
	@Override
	public int getCustomerId() {
		return this.customerId;
	}

	// Returns string form of order
	@Override
	public String toString() {
		return "DefaultOrder [creditCardNumber=" + creditCardNumber + ", products=" + Arrays.toString(products)
				+ ", customerId=" + customerId + "]";
	}

	

}
