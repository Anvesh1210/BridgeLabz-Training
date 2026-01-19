package com.smartcheckout;

import java.util.*;

//class representing supermarket customer
public class Customer {

	// attributes for Customer
	private String name;
	private List<String> items;

	// constructor for customer
	public Customer(String name, List<String> items) {
		this.name = name;
		this.items = items;
	}

	// method for getting customer name
	public String getName() {
		return name;
	}

	// method for getting items list
	public List<String> getItems() {
		return items;
	}
}
