package com.swiftcart;

//class to represent a product
public abstract class Product {
	
	//product attributes
	protected String name;
    protected double price;
    protected String category;
    protected int quantity;

    //constructor to initialize products
    Product(String name, double price, String category, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    abstract double getDiscount();

    double getTotalPrice() {
        return price * quantity;
    }
}
