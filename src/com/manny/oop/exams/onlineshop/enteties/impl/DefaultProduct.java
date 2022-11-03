package com.manny.oop.exams.onlineshop.enteties.impl;

import com.manny.oop.exams.onlineshop.enteties.Product;

public class DefaultProduct implements Product {

	private int id;
	private String productName;
	private String categoryName;
	private double price;

	public DefaultProduct() {
	}

	public DefaultProduct(int id, String productName, String categoryName, double price) {
		// <write your code here>
		this.id = id;
		this.productName = productName;
		this.categoryName = categoryName;
		this.price = price;
	}

	// Return string form of DefaultProduct
	@Override
	public String toString() {
		return "DefaultProduct [id=" + id + ", productName=" + productName + ", categoryName=" + categoryName
				+ ", price=" + price + "]";
	}

	// Returns a product's id
	@Override
	public int getId() {
		return this.id;
	}

	// Returns a product's name
	@Override
	public String getProductName() {
		return this.productName;
	}

}
