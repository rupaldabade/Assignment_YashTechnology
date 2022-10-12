package com.productcurd.pojo;

public class Product {

	String pmsId;
	String name;
	double price;

	public String getPmsId() {
		return pmsId;
	}
	public void setPmsId(String pmsId) {
		this.pmsId = pmsId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public Product(String pmsId, String name, double price) {
		super();
		this.pmsId = pmsId;
		this.name = name;
		this.price = price;
	}

	public void displyDetails() {
		System.out.println("\nProduct Id.."+pmsId);
		System.out.println("Product Name.."+name);
		System.out.println("Product Price.."+price+"\n");
	}
}
