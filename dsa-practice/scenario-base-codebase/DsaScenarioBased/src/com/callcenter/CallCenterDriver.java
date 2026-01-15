package com.callcenter;

public class CallCenterDriver {
	public static void main(String[] args) {
		CallCenter callCenter = new CallCenter();
		Customer c1 = new Customer("C101", "Anvesh", false);
		Customer c2 = new Customer("C102", "Ravi", true);
		Customer c3 = new Customer("C103", "Sneha", false);
		Customer c4 = new Customer("C104", "Amit", true);

		callCenter.receiveCall(c1);
		callCenter.receiveCall(c2);
		callCenter.receiveCall(c3);
		callCenter.receiveCall(c4);
		callCenter.receiveCall(c2);

		callCenter.showQueueStatus();

		callCenter.serveNextCall();
		callCenter.serveNextCall();
		callCenter.serveNextCall();

		callCenter.showCallFrequency();
	}
}
