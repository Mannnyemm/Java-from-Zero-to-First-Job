package com.manny.javacollections.comparatorexample;

import java.util.Comparator;

public class CustomProductComparator implements Comparator<Product> {

	@Override
	public int compare(Product product1, Product product2) {
// 		<write your code here>
		return product1.getPrice() > product2.getPrice() ? 1 : (product1.getPrice() < product2.getPrice() ? -1 :0);
	}

}
