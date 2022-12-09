package com.mymart.view;

import java.util.LinkedList;
import java.util.Scanner;

import com.mymart.model.Product;
import com.mymart.service.ProductService;

public class ProductView {
	private static ProductService pdser=new ProductService(); 
	
	public void addProduct() {
		Scanner sc=new Scanner(System.in);
		int pId=sc.nextInt();
		String pName=sc.next();
		double pPrice=sc.nextDouble();
		
		Product pd=new Product();
		pdser.addProductService(pd);
		
	}
	public void displayAllProducts() {
		 LinkedList<Product> product=pdser.getAllProductsService();
		 for(Product p:product) {
			 System.out.println("Product Details : ");
			 System.out.println("Product ID : "+p.getProductId());
			 System.out.println("Product Name : "+p.getProductName());
			 System.out.println("Product Price : "+p.getProductPrice());
		 }
	}
	

}
