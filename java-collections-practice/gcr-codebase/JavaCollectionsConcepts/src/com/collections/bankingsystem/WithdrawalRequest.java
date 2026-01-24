package com.collections.bankingsystem;

//class to represent Withdraw Request
public class WithdrawalRequest {

	//withdraw request attributes
	private String accountNumber;
	private double amount;

	//constructor to initialize withdraw request
	public WithdrawalRequest(String accountNumber, double amount) {
		this.accountNumber = accountNumber;
		this.amount = amount;
	}

	//getter methods
	public String getAccountNumber() {
		return accountNumber;
	}

	public double getAmount() {
		return amount;
	}
}
