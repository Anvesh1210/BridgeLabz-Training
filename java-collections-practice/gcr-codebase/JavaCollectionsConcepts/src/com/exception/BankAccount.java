package com.exception;

public class BankAccount {
	private double balance = 5000;

	void withdraw(double amount) throws InsufficientBalanceException {
		if (amount < 0) {
			throw new IllegalArgumentException();
		}
		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance!");
		}
		balance -= amount;
		System.out.println("Withdrawal successful, new balance: " + balance);
	}
}
