package com.mymart.dao;

import java.util.LinkedList;

import com.mymart.model.Product;

public class ProductDAO {
	private static LinkedList<Product> ll = new LinkedList<Product>();
	
	public boolean addProduct(Product pd) {
		boolean addStatus=false;
		ll.add(pd);
		System.out.println("Hello");
		addStatus=true;
		return addStatus;
		
	}
	
	public LinkedList<Product>getAllProducts(){
		return ll;
	}

	
	
	

}
