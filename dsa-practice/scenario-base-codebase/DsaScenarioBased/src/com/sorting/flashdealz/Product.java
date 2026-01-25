package com.sorting.flashdealz;

//class to represent a product
public class Product {
	// product attributes
	private String productName;
	private double discount;

	// constructor to initialize product
	public Product(String productName, double discount) {
		this.productName = productName;
		this.discount = discount;
	}

	// method to get discount
	public double getDiscount() {
		return discount;
	}

	// method to display product details
	public void display() {
		System.out.println("Product: " + productName + " | Discount: " + discount + "%");
	}
}
