package com.productcurd.util;

import com.productcurd.pojo.Product;

public class Util {

	public static int productExistInArray(Product[] productList) {// how many product exist in store 
		int arraySize = 0;
		if(productList == null || sizeOfArray(productList) == 0) {

		}else {
			for(int i=0; i<sizeOfArray(productList); i++) {
				if(productList[i] == null || productList[i].equals(null)) {

				}else {
					arraySize = arraySize+1;
				}
			}
		}
		return arraySize;
	}

	public static int sizeOfArray(Product[] productList) { //get count of total product you can store -- product list length
		int productSize = 0;
		try {
			productSize = productList.length;
		} catch (Exception e) {
		}
		return productSize;
	}
}
