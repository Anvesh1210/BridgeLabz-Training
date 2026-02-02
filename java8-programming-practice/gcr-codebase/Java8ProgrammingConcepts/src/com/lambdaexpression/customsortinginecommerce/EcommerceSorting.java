package com.lambdaexpression.customsortinginecommerce;

import java.util.ArrayList;
import java.util.List;

public class EcommerceSorting {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Laptop", 60000, 4.5, 10));
        products.add(new Product("Phone", 30000, 4.8, 20));
        products.add(new Product("Headphones", 2000, 4.2, 5));
        products.add(new Product("Tablet", 25000, 4.0, 15));
        System.out.println("Original List");
        for(Product p:products) {
        	System.out.println(p);
        }
        
        System.out.println("\nSorted by price");
        products.sort((a,b) -> Double.compare(a.price ,b.price));
        for(Product p:products) {
        	System.out.println(p);
        }
        
        System.out.println("\nSorted by rating");
        products.sort((a,b) -> Double.compare(a.rating ,b.rating));
        for(Product p:products) {
        	System.out.println(p);
        }
        
        System.out.println("\nSorted by discount");
        products.sort((a,b) -> Double.compare(a.discount ,b.discount));
        for(Product p:products) {
        	System.out.println(p);
        }
	}
}
