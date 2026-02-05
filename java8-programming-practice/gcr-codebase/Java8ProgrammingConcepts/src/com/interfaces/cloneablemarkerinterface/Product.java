package com.interfaces.cloneablemarkerinterface;

public class Product implements Cloneable {
	int productId;

	// constructor
	public Product(int productId) {
		this.productId = productId;
	}

	// clone method
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
