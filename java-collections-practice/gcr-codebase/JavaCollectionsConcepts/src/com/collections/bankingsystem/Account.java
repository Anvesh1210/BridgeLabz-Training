package com.collections.bankingsystem;

//class to representing a account
public class Account {
	private String accountNumber;
	private double balance;

	//constructor to initialize account
	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	//getter method for account
	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	//method to withdraw from account
	public boolean withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			return true;
		}
		return false;
	}

	//overriding toString method
	@Override
	public String toString() {
		return "AccountNumber=" + accountNumber + ", Balance=₹" + balance;
	}
}
