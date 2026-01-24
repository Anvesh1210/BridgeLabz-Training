package com.collections.bankingsystem;

//class to use Banking System
public class BankingSystemDriver {
	public static void main(String[] args) {

		// creating Banking System
		BankingSystem bank = new BankingSystem();

		// adding bank account
		bank.addAccount(new Account("ACC1001", 5000));
		bank.addAccount(new Account("ACC1002", 12000));
		bank.addAccount(new Account("ACC1003", 8000));

		// deposit money
		bank.deposit("ACC1001", 2000);

		// requesting withdrawal
		bank.requestWithdrawal("ACC1001", 3000);
		bank.requestWithdrawal("ACC1002", 15000); // insufficient balance
		bank.requestWithdrawal("ACC1003", 4000);

		System.out.println();
		bank.processWithdrawals();

		System.out.println();
		bank.displayAllAccounts();

		System.out.println();
		bank.displayCustomersSortedByBalance();
	}
}
