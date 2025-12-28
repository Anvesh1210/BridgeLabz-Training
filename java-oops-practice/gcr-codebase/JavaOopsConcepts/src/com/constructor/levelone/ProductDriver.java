package com.constructor.levelone;

public class ProductDriver {
	 public static void main(String[] args) {
		 
		 	//creating three product object
	        Product p1 = new Product("Laptop", 65000);
	        Product p2 = new Product("Smartphone", 25000);
	        Product p3 = new Product("Headphones", 3000);
	        
	        //displaying details by calling method
	        p1.displayProductDetails();
	        p2.displayProductDetails();
	        p3.displayProductDetails();

	        //displaying total products
	        Product.displayTotalProducts();
	    }
}
