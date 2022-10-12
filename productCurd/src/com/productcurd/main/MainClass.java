package com.productcurd.main;

import com.productcurd.service.ProductService;

public class MainClass {

	static ProductService productService = new ProductService();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		productService.productStoreDetails();
	}

}
