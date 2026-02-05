package com.collectors.orderrevenuesummary;

//class representing a order
public class Order {
	//order attributes
	private String customerName;
	private double totalBill;

	//constructor to initialize order
	public Order(String customerName, double totalBill) {
		this.customerName = customerName;
		this.totalBill = totalBill;
	}

	//gatter methods for order
	public String getCustomerName() {
		return customerName;
	}

	public double getTotalBill() {
		return totalBill;
	}

	//overridden toString() method
	@Override
	public String toString() {
		return "Order [customerName=" + customerName + ", totalBill=" + totalBill + "]";
	}

}
