package com.smartcheckout;

import java.util.*;

//main class for running smart checkout
public class SmartCheckoutApp {

	// method for main execution
	public static void main(String[] args) {

		Inventory inventory = new Inventory();

		inventory.addItem("Milk", 40, 5);
		inventory.addItem("Bread", 30, 3);
		inventory.addItem("Eggs", 60, 2);

		CheckoutCounter counter = new CheckoutCounter(inventory);

		Customer c1 = new Customer("Rahul", Arrays.asList("Milk", "Bread"));
		Customer c2 = new Customer("Anita", Arrays.asList("Eggs", "Milk"));
		Customer c3 = new Customer("Ravi", Arrays.asList("Eggs", "Eggs", "Bread"));

		counter.addCustomer(c1);
		counter.addCustomer(c2);
		counter.addCustomer(c3);

		counter.processCustomer();
		counter.processCustomer();
		counter.processCustomer();
	}
}
