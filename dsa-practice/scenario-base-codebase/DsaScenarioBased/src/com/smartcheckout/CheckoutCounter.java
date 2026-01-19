package com.smartcheckout;

import java.util.*;

//class representing checkout queue
public class CheckoutCounter {

	// attributes for CheckoutCounter
	private Queue<Customer> queue;
	private Inventory inventory;

	// constructor for checkout counter
	public CheckoutCounter(Inventory inventory) {
		this.inventory = inventory;
		queue = new LinkedList<>();
	}

	// method for adding customer to queue
	public void addCustomer(Customer c) {
		queue.offer(c);
		System.out.println(c.getName() + " added to billing queue");
	}

	// method for processing next customer
	public void processCustomer() {

		if (queue.isEmpty()) {
			System.out.println("No customers in queue");
			return;
		}

		Customer c = queue.poll();
		double total = 0;

		System.out.println("Processing customer: " + c.getName());

		for (String item : c.getItems()) {

			if (inventory.getStock(item) > 0) {
				double price = inventory.getPrice(item);
				total += price;
				inventory.reduceStock(item);
			} else {
				System.out.println(item + " out of stock");
			}
		}

		System.out.println("Total Bill: ₹" + total);
	}
}
