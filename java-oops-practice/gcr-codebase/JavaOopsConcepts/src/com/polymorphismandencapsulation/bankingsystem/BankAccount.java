package com.polymorphismandencapsulation.bankingsystem;

//Abstract base class for all bank accounts
public abstract class BankAccount {

	//bank account attributes
	protected String accountNumber;
	protected String holderName;
	private double balance;

	//constructor
	public BankAccount(String accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

	//deposit money
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Amount deposited successfully.");
		}
	}

	//withdraw money
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Amount withdrawn successfully.");
		} else {
			System.out.println("Insufficient balance.");
		}
	}

	//getter for balance
	public double getBalance() {
		return balance;
	}

	//setter for internal use
	protected void setBalance(double balance) {
		this.balance = balance;
	}

	//abstract method (polymorphic behavior)
	public abstract void calculateInterest();
	}

