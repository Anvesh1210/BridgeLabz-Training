package com.generics.dynamiconlinemarketplace;

//class to represent a product
public class Product<T extends Category> {

	// product attributes
	private String name;
	private double price;
	private T category;

	// constructor to initialize attributes
	public Product(String name, double price, T category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}

	// getter and setter method for price
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	//display method for product details
	public void display() {
		System.out.println("Product: " + name + ", Category: " + category.getCategoryName() + ", Price: ₹" + price);
	}
}
