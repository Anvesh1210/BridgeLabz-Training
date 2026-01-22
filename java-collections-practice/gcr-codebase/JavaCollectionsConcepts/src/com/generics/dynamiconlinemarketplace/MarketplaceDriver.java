package com.generics.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class MarketplaceDriver {
	public static void main(String[] args) {

		// List to store product
		List<Product<?>> catalog = new ArrayList<>();
		Product<BookCategory> book = new Product<>("Java Programming", 500, new BookCategory());
		Product<ClothingCategory> clothing = new Product<>("T-Shirt", 1200, new ClothingCategory());
		Product<GadgetCategory> gadget = new Product<>("Smartphone", 25000, new GadgetCategory());

		catalog.add(book);
		catalog.add(clothing);
		catalog.add(gadget);

		System.out.println("---- Before Discount ----");
		for (Product<?> product : catalog) {
			product.display();
		}

		// apply discount
		DiscountUtil.applyDiscount(book, 10);
		DiscountUtil.applyDiscount(clothing, 20);
		DiscountUtil.applyDiscount(gadget, 5);

		System.out.println("\n---- After Discount ----");
		for (Product<?> product : catalog) {
			product.display();
		}
	}
}
