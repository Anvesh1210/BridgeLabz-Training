package com.polymorphismandencapsulation.onlinefooddeliverysystem;

//non-veg food item
public class NonVegItem extends FoodItem implements Discountable {

	private static final double NON_VEG_CHARGE = 50; // extra charge per item

	public NonVegItem(String itemName, double price, int quantity) {
		super(itemName, price, quantity);
	}

	//total price includes extra non-veg charges
	@Override
	public double calculateTotalPrice() {
		return (getPrice() * getQuantity()) + (NON_VEG_CHARGE * getQuantity());
	}

	//discount on non-veg items
	@Override
	public double applyDiscount() {
		return calculateTotalPrice() * 0.05;
	}

	@Override
	public String getDiscountDetails() {
		return "5% discount applied on Non-Veg Item";
	}
}
