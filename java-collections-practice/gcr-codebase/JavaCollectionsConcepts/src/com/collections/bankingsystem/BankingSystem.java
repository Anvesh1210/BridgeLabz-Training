package com.collections.bankingsystem;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

//class to represent banking system
public class BankingSystem {
	private Map<String, Account> accountMap = new HashMap<>();
	private Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

	//method to add account
	public void addAccount(Account account) {
		accountMap.put(account.getAccountNumber(), account);
	}

	//method to deposit money
	public void deposit(String accountNumber, double amount) {
		Account account = accountMap.get(accountNumber);
		if (account != null) {
			account.deposit(amount);
		}
	}

	//method to add withdrawal request to queue
	public void requestWithdrawal(String accountNumber, double amount) {
		withdrawalQueue.offer(new WithdrawalRequest(accountNumber, amount));
	}

	//method to process withdrawal requests
	public void processWithdrawals() {
		System.out.println("Processing Withdrawals:");
		while (!withdrawalQueue.isEmpty()) {
			WithdrawalRequest request = withdrawalQueue.poll();
			Account account = accountMap.get(request.getAccountNumber());

			if (account != null && account.withdraw(request.getAmount())) {
				System.out.println(
						"Withdrawal Successful: " + request.getAccountNumber() + " -> ₹" + request.getAmount());
			} else {
				System.out.println("Withdrawal Failed: " + request.getAccountNumber());
			}
		}
	}

	//method to display customers sorted by balance
	public void displayCustomersSortedByBalance() {

		TreeMap<Double, String> sortedByBalance = new TreeMap<>();

		for (Account account : accountMap.values()) {
			sortedByBalance.put(account.getBalance(), account.getAccountNumber());
		}

		System.out.println("Customers sorted by balance:");
		for (Map.Entry<Double, String> entry : sortedByBalance.entrySet()) {
			System.out.println("Account: " + entry.getValue() + ", Balance: ₹" + entry.getKey());
		}
	}

	//method to display all accounts
	public void displayAllAccounts() {
		System.out.println("All Accounts:");
		for (Account account : accountMap.values()) {
			System.out.println(account);
		}
	}
}
