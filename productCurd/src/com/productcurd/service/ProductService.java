package com.productcurd.service;

import java.util.Scanner;

import com.productcurd.pojo.Product;
import com.productcurd.util.Constant;
import com.productcurd.util.Util;

public class ProductService {

	//function starting
	public void productStoreDetails() { 
		System.out.println("How many product do you want to add in your Store? - ");
		totalProduct = scan.nextInt();
		productList = new Product[totalProduct];
		showMainMenu();
	}

	static Scanner scan = new Scanner(System.in);
	static Product[] productList;
	static int totalProduct =0;
	static int productSize = 0;
	Constant cons = new Constant();

	//show main menu function
	public static void showMainMenu(){

		System.out.println("--- MAIN MENU ---");
		System.out.println("1. Add Product");
		System.out.println("2. Update Product");
		System.out.println("3. Delete Product");
		System.out.println("4. Get Product By Id");
		System.out.println("5. Show All Product Details");
		System.out.println("6. Exit");

		System.out.print("Enter your Choice : ");

		int option = scan.nextInt();

		switch(option){
		case 1:
			addProduct();
			break;
		case 2:
			updateProduct();
			break;
		case 3:
			deleteProduct();
			break;
		case 4:
			getProductById();
			break;
		case 5:
			showProductDetails();
			break;
		case 6: 
			exitFunction();
			break;
		default:
			System.out.println("Invalid option!");
			showMainMenu();
		}
	}

	//option 1 add product in list
	public static void addProduct(){

		int productExistInArray = Util.productExistInArray(productList);
		int productDiff = Util.sizeOfArray(productList) - productExistInArray;

		System.out.println("You can add only "+productDiff+" product in store.");
		System.out.println("Now how much product do you want to add in list? - ");
		int productCount = scan.nextInt();
		if((productCount >0 )&& (productCount <=  productDiff)) {
			for(int i=0; i<productCount; i++) {
				System.out.println("\nEnter product id - ");
				String productId = scan.next();
				System.out.println("Enter product name - ");
				String productName = scan.next();
				System.out.println("Enter product price - ");
				double productPrice ;
				try {
				 productPrice = scan.nextDouble();
				}catch(Exception e) {
					System.out.println("Enter valid price - ");
					productPrice = scan.nextDouble();
				}
				productList[productExistInArray+i] = new Product(productId, productName, productPrice);
			}
			System.out.println("\nAdded successfully!!! \n");
			System.out.println("Do you want to add more product? if yes than press 'y' \n");
			String addChoice = scan.next();
			if(addChoice.equalsIgnoreCase("y")) {

				addProduct();
			}else
				showMainMenu();
		}else {
			System.out.println("You can not add more than "+productDiff+" product! \n");
			showMainMenu();
		}
	}

	//option 2 update a product by id
	public static void updateProduct() {

		productSize = Util.productExistInArray(productList);
		if(productSize > 0) {
			System.out.println("Enter the id of the product to be updated");
			String id = scan.next();
			System.out.println("\nEnter the updated id");
			String newId = scan.next();
			System.out.println("Enter the updated name");
			String newName = scan.next();
			System.out.println("Enter the updated price");
			double newPrice ;
			try {
				newPrice = scan.nextDouble();
				}catch(Exception e) {
					System.out.println("Enter valid price - ");
					newPrice = scan.nextDouble();
				}
			for (int i = 0; i < productSize; i++) {
				if (productList[i].getPmsId().equalsIgnoreCase(id)) {
					productList[i] = new Product(newId, newName, newPrice);
					break;
				}
			}
			System.out.println("\nUpdated successfully!!! \n");
		}else
			System.out.println(Constant.PRODUCT_NOT_FOUND_ALERT);
		showMainMenu();
	}

	//option 3 delete product by id
	public static void deleteProduct() {
		productSize = Util.productExistInArray(productList);
		if(productSize > 0) {
			System.out.println("Enter the id of the product to be deleted");
			String id = scan.next();

			Product[] output = new Product[productSize - 1];

			int count = 0;
			for (Product i : productList) {
				if (!i.getPmsId().equalsIgnoreCase(id)) {
					output[count++] = i;
				}
			}
			productList = output;
			System.out.println("\nDeleted successfully!!! \n");
		}else
			System.out.println(Constant.PRODUCT_NOT_FOUND_ALERT);
		showMainMenu();
	}

	//option 4 get product details by id
	public static void getProductById() {
		productSize = Util.productExistInArray(productList);
		int i = 0;
		if(productSize > 0) {
			System.out.println("Enter the id of the product");
			String id = scan.next();
			for (i=0; i < productSize; i++) {
				if (productList[i].getPmsId().equalsIgnoreCase(id)) {

					System.out.println("Product Id - "+productList[i].getPmsId()+"\n Product Name - "+productList[i].getName()+"\n Product Price -"+productList[i].getPrice());
					showMainMenu();
				}
			}
			if(i==productSize) {
				System.out.println("\nNo product found by this id!!!\n");
			}
		}else
			System.out.println(Constant.PRODUCT_NOT_FOUND_ALERT);
		showMainMenu();
	}

	//option 5 show all products
	public static void showProductDetails(){ 
		productSize = Util.productExistInArray(productList);
		if(productSize > 0) {
			for (int i = 0; i < productSize; i++){
				System.out.println("\nProduct Id.."+productList[i].getPmsId());
				System.out.println("Product Name.."+productList[i].getName());
				System.out.println("Product Price.."+productList[i].getPrice()+"\n");
			}
		}else
			System.out.println(Constant.PRODUCT_NOT_FOUND_ALERT);
		showMainMenu();
	}

	// option 6 exit function
	private static void exitFunction() {
		scan.close();
		System.exit(0);
	}

}
