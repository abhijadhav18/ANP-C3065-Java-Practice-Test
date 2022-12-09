package com.mymart.service;

import java.util.LinkedList;
import java.util.Scanner;

import com.mymart.dao.ProductDAO;
import com.mymart.model.Product;

public class ProductService {
	
	private static ProductDAO pddao=new ProductDAO();
	
	public boolean addProductService(Product p) {
		boolean addStatus=pddao.addProduct(p);
		return addStatus;
	}
	public LinkedList<Product>getAllProductsService(){
		return  ;
	}
}
