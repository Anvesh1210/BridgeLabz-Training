package com.junit.advanced;

//class to represent a Bank Account
public class BankAccount {
	private double balance;

	// constructor to initialize initial balance
	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	// method to deposit
	public void deposit(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Deposit amount must be positive");
		}
		balance += amount;
	}

	// method for withdraw
	public void withdraw(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Withdrawal amount must be positive");
		}
		if (amount > balance) {
			throw new IllegalArgumentException("Insufficient funds");
		}
		balance -= amount;
	}

	// method to get balance
	public double getBalance() {
		return balance;
	}
}
