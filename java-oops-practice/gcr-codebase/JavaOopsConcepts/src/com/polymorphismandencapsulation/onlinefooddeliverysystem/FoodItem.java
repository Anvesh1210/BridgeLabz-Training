package com.polymorphismandencapsulation.onlinefooddeliverysystem;

//Abstract base class for all food items
public abstract class FoodItem {
	//FoodItem Attributes
	protected String itemName;

	private double price;
	private int quantity;

	//constructor
	public FoodItem(String itemName, double price, int quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}

	//getter methods
	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	//method common to all food items
	public void getItemDetails() {
		System.out.println("Item Name : " + itemName);
		System.out.println("Price     : " + price);
		System.out.println("Quantity  : " + quantity);
	}

	//abstract method
	public abstract double calculateTotalPrice();
}

