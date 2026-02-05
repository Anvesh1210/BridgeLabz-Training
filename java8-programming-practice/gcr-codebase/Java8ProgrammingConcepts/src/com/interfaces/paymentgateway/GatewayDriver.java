package com.interfaces.paymentgateway;

public class GatewayDriver {
	public static void main(String[] args) {
		PaymentProcessor p = amount -> System.out.println("Paid ₹" + amount);
		p.pay(1000);
		p.refund(200);
	}
}
