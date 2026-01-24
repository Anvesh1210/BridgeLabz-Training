package com.collections.shoppingcart;

//class to represent a Product
public class Product {
	// product attributes
	private String name;
	private double price;

	// constructor to initialize product
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// method to get Name of product
	public String getName() {
		return name;
	}

	// method to get price of product
	public double getPrice() {
		return price;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Product))
			return false;
		Product other = (Product) obj;
		return name.equalsIgnoreCase(other.name);
	}

	@Override
	public int hashCode() {
		return name.toLowerCase().hashCode();
	}

	@Override
	public String toString() {
		return name + " (₹" + price + ")";
	}
}
