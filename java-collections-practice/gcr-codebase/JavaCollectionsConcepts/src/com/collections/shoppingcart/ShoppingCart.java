package com.collections.shoppingcart;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//creating Shopping Cart
public class ShoppingCart {
	private Map<Product, Double> priceMap = new HashMap<>();
	private Map<Product, Double> orderMap = new LinkedHashMap<>();

	// method to add a product
	public void addProduct(Product product) {
		priceMap.put(product, product.getPrice());
		orderMap.put(product, product.getPrice());
	}

	// method to display items in order of addition
	public void displayCartInOrder() {
		System.out.println("Cart items (Insertion Order):");
		for (Map.Entry<Product, Double> entry : orderMap.entrySet()) {
			System.out.println(entry.getKey().getName() + " : " + entry.getValue());
		}
	}

	// method to display items sorted by price
	public void displayItemsSortedByPrice() {

		TreeMap<Double, String> sortedByPrice = new TreeMap<>();

		for (Map.Entry<Product, Double> entry : priceMap.entrySet()) {
			sortedByPrice.put(entry.getValue(), entry.getKey().getName());
		}

		System.out.println("Cart items (Sorted by Price):");
		for (Map.Entry<Double, String> entry : sortedByPrice.entrySet()) {
			System.out.println(entry.getValue() + " : " + entry.getKey());
		}
	}

	// method to calculate total price
	public double getTotalPrice() {
		double total = 0;
		for (double price : priceMap.values()) {
			total += price;
		}
		return total;
	}
}
