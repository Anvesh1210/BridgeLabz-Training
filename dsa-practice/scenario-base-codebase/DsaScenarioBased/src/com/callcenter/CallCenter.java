package com.callcenter;

import java.util.*;

public class CallCenter {
	private Queue<Customer> normalQueue;
	private PriorityQueue<Customer> vipQueue;
	private HashMap<String, Integer> callFrequency;

	public CallCenter() {
		normalQueue = new LinkedList<>();
		vipQueue = new PriorityQueue<>();
		callFrequency = new HashMap<>();
	}

	// Add incoming call
	public void receiveCall(Customer customer) {

		if (customer.isVIP()) {
			vipQueue.offer(customer);
		} else {
			normalQueue.offer(customer);
		}

		// Track call frequency
		callFrequency.put(customer.getCustomerId(), callFrequency.getOrDefault(customer.getCustomerId(), 0) + 1);

		System.out.println("Call received from " + customer.getName());
	}

	// Serve next call
	public void serveNextCall() {
		Customer customer;

		if (!vipQueue.isEmpty()) {
			customer = vipQueue.poll();
		} else if (!normalQueue.isEmpty()) {
			customer = normalQueue.poll();
		} else {
			System.out.println("No calls in queue.");
			return;
		}

		System.out.println("\nServing Customer:");
		customer.display();
	}

	// Display call frequency
	public void showCallFrequency() {
		System.out.println("\nCustomer Call Frequency:");
		for (Map.Entry<String, Integer> entry : callFrequency.entrySet()) {
			System.out.println("Customer ID: " + entry.getKey() + " | Calls: " + entry.getValue());
		}
	}

	// Display queue status
	public void showQueueStatus() {
		System.out.println("\nVIP Queue Size: " + vipQueue.size());
		System.out.println("Normal Queue Size: " + normalQueue.size());
	}
}
