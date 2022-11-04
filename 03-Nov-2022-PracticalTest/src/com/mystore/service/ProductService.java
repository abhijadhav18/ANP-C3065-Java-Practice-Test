package com.mystore.service;

import com.mystore.dao.*;
import com.mystore.model.*;

public class ProductService {
	ProductDAO prodDAO = new ProductDAO();

	public void addProductService(Product product) {
		prodDAO.addProduct(product);
	}

	public Product[] getProductByNameStartWithService(String s) {
		Product[] prodArr3 = prodDAO.getProductByNameStartWith(s); // declared empty array which will store output of
																	// prodArr2
		return prodArr3;
	}

	public Product[] getAllProducts() {
		Product prodArr4[] = prodDAO.getAllProducts(); // storing all data from prodArr(initial array) to prodArr4
		return prodArr4;
	}
}