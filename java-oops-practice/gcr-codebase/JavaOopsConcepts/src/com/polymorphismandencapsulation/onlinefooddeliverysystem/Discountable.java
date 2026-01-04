package com.polymorphismandencapsulation.onlinefooddeliverysystem;

//interface defining discount related behavior
public interface Discountable {
	// Apply discount on total price
	double applyDiscount();

	// Return discount details
	String getDiscountDetails();
}

