package com.mymart.model;


public class Product {
	int productId;
	String productName;
	double productPrice;

	public void setProductId(int productId) {
		this.productId = productId;

	}

	public void setProductName(String productName) {
		this.productName = productName;

	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;

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
	
	public String toString(){ 
		return "[productId="+productId+" productName="+productName+" productPrice="+productPrice+"]";

	}
	
	public boolean equals(Product pd) {
		if(this==pd)
			return true;
		else 
			return false;

		
	}
	
	public String hashCode(int productId , String productName , double productPrice) {
		Product i=new Product();
		
		String hashcode=("832@"+i.productId+"765@"+i.productName+"951@"+i.productPrice);
		return hashcode;
	}
	
	

}
