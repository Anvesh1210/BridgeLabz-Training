package com.interfaces.digitalpaymentinterface;

public class Wallet implements Payment {
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using Wallet");
	}
}
