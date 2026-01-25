package com.sorting.flashdealz;

//class to use Flash Dealz
public class FlashDealzDriver {
	public static void main(String[] args) {
		// creating multiple products
		Product[] products = { new Product("Laptop", 35.5), new Product("Smartphone", 50.0),
				new Product("Headphones", 20.0), new Product("Smartwatch", 45.0), new Product("Camera", 30.0),
				new Product("Tablet", 40.0) };
		FlashDealz manager = new FlashDealz();
		System.out.println("Products Before Sorting:");
		manager.displayProducts(products);
		manager.quickSort(products);
		System.out.println("\nTop Discounted Products (After Sorting):");
		manager.displayProducts(products);
	}
}
