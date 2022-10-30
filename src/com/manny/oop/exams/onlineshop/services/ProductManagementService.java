package com.manny.oop.exams.onlineshop.services;

import com.manny.oop.exams.onlineshop.enteties.Product;

public interface ProductManagementService {

	Product[] getProducts();

	Product getProductById(int productIdToAddToCart);

}
