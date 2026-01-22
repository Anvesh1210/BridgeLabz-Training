package com.generics.dynamiconlinemarketplace;

//class for Discount Unit
public class DiscountUtil {
	// Generic method with bounded type
	public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
		double discountedPrice = product.getPrice() - (product.getPrice() * percentage / 100);
		product.setPrice(discountedPrice);
	}
}
