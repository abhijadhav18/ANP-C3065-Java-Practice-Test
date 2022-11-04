package com.mystore.model;

public class Product {
	int productId;
	String productName;
	double productPrice;

	public Product() {
		
	}
	public Product(int productId, String productName, double productPrice) {
		
	}

	public Product(int prodId) {
		productId = prodId;

	}
	public Product(String prodName) {
		productName = prodName;

	}
	public Product(double prodPrice) {
		productPrice = prodPrice;

	}

	public void setProductId(int prodId) {
		productId = prodId;

	}

	public void setProductName(String prodName) {

		productName = prodName;

	}

	public void setProductPrice(double prodPrice) {

		productPrice = prodPrice;

	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

}
