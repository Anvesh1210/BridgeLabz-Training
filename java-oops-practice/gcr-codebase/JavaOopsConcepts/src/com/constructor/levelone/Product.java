package com.constructor.levelone;

public class Product {
	//creating instance variables
    private String productName;
    private double price;

    //creating class variable
    private static int totalProducts = 0;

    //creating parameterized constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    //method to display products
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }

    //static method to display total no of products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}
