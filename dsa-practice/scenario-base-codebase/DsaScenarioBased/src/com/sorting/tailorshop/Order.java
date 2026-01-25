package com.sorting.tailorshop;

public class Order {
	//attributes
	private String orderId;
	private int deliveryDeadline; 
	
	//constructor for initializing order details
	public Order(String orderId, int deliveryDeadline) {
		this.orderId = orderId;
		this.deliveryDeadline = deliveryDeadline;
	}

	//getter and setter methods for order
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public int getDeliveryDeadline() {
		return deliveryDeadline;
	}

	public void setDeliveryDeadline(int deliveryDeadline) {
		this.deliveryDeadline = deliveryDeadline;
	}

	// method for displaying order details
	public void display() {
		System.out.println();
		System.out.println("Order ID: " + orderId );
		System.out.println("Delivery Deadline: " + deliveryDeadline + " days");
	}
}
