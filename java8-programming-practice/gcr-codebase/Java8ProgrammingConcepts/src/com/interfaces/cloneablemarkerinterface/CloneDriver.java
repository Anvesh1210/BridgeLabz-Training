package com.interfaces.cloneablemarkerinterface;

public class CloneDriver {
	public static void main(String[] args) throws CloneNotSupportedException {
		Product p1 = new Product(101);
		// Checking marker interface
		if (p1 instanceof Cloneable) {
			Product p2 = (Product) p1.clone();
			System.out.println("Object cloned successfully");
		} else {
			System.out.println("Cloning not allowed");
		}
	}
}
