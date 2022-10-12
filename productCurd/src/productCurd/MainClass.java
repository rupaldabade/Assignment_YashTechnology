package productCurd;

import java.util.Scanner;

import com.productcurd.pojo.Product;

public class MainClass {

	static Scanner scan = new Scanner(System.in);
	static Product[] productList;
	static int totalProduct =0;
	static int productSize = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many product do you want to add in your Store? - ");
		totalProduct = scan.nextInt();
		productList = new Product[totalProduct];
		showMainMenu();
	}

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
			System.exit(0);
			break;
		default:
			System.out.println("Invalid option!");
			showMainMenu();
		}
	}

	public static int arraySize() {//now how many product exist in store 
		int arraySize = 0;
		if(productList == null || totalProductInList() == 0) {

		}else {
			for(int i=0; i<totalProductInList(); i++) {
				if(productList[i] == null || productList[i].equals(null)) {

				}else {
					arraySize = arraySize+1;
				}
			}
		}
		return arraySize;
	}

	public static int totalProductInList() { //get count of total product you can store 
		try {
			productSize = productList.length;
		} catch (Exception e) {
			productSize = 0;
		}
		return productSize;
	}

	public static void addProduct(){

		int arraySize = arraySize();
		int productDiff = totalProductInList() - arraySize;

		System.out.println("You can add only "+productDiff+" product in store.");
		System.out.println("Now how much product do you want to add in list? - ");
		int productCount = scan.nextInt();
		if(productCount <=  productDiff) {
			for(int i=0; i<productCount; i++) {
				System.out.println("\nEnter product id - ");
				String productId = scan.next();
				System.out.println("Enter product name - ");
				String productName = scan.next();
				System.out.println("Enter product price - ");
				double productPrice = scan.nextDouble();
				productList[arraySize+i] = new Product(productId, productName, productPrice);
			}
			System.out.println("\n Added successfully!!! \n");
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

	public static void showProductDetails(){
		productSize = arraySize();
		if(productSize > 0) {
			for (int i = 0; i < productSize; i++){
				System.out.println("\nProduct Id.."+productList[i].getPmsId());
				System.out.println("Product Name.."+productList[i].getName());
				System.out.println("Product Price.."+productList[i].getPrice()+"\n");
			}
		}else
			System.out.println("No one product added in store please add product first. \n");
		showMainMenu();
	}

	public static void updateProduct() {

		productSize = arraySize();
		if(productSize > 0) {
			System.out.println("Enter the id of the product to be updated");
			String id = scan.next();
			System.out.println("\nEnter the updated id");
			String newId = scan.next();
			System.out.println("Enter the updated name");
			String newName = scan.next();
			System.out.println("Enter the updated price");
			double newPrice = scan.nextDouble();
			for (int i = 0; i < productSize; i++) {
				if (productList[i].getPmsId().equalsIgnoreCase(id)) {
					productList[i] = new Product(newId, newName, newPrice);
					break;
				}
			}
			System.out.println("\n Updated successfully!!! \n");
		}else
			System.out.println("No one product added in store please add product first. \n");
		showMainMenu();
	}

	public static void deleteProduct() {
		productSize = arraySize();
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
			System.out.println("\n Deleted successfully!!! \n");
		}else
			System.out.println("No one product added in store please add product first. \n");
		showMainMenu();
	}

	public static void getProductById() {
		productSize = arraySize();
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
			System.out.println("No one product added in store please add product first. \n");
		showMainMenu();
	}
}
