package com.polymorphismandencapsulation.onlinefooddeliverysystem;

//veg food item
public class VegItem extends FoodItem implements Discountable {

	public VegItem(String itemName, double price, int quantity) {
		super(itemName, price, quantity);
	}

	//total price = price * quantity (no extra charges)
	@Override
	public double calculateTotalPrice() {
		return getPrice() * getQuantity();
	}

	//discount on veg items
	@Override
	public double applyDiscount() {
		return calculateTotalPrice() * 0.10;
	}

	@Override
	public String getDiscountDetails() {
		return "10% discount applied on Veg Item";
	}
}
