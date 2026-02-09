package com.multithreading.bankingsystem;

public class Transaction implements Runnable {
	private BankAccount account;
	private int amount;

	Transaction(BankAccount account, int amount) {
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void run() {
		System.out.println("[" + Thread.currentThread().getName() + "] Attempting to withdraw " + amount);

		if (account.balance >= amount) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			account.balance -= amount;
			System.out.println("Transaction successful: " + Thread.currentThread().getName() + ", Amount: " + amount
					+ ", Balance: " + account.balance);
		} else {
			System.out.println("Transaction failed: " + Thread.currentThread().getName());
		}
	}
}
