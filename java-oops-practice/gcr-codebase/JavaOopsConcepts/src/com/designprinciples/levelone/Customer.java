package com.designprinciples.levelone;

import java.util.ArrayList;

public class Customer {
	private String customerName;
    private ArrayList<Account> accounts;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Communication method
    public void viewBalance() {
        System.out.println("\nCustomer: " + customerName);
        for (Account acc : accounts) {
            System.out.println(
                "Account No: " + acc.getAccountNumber() +
                ", Bank: " + acc.getBankName() +
                ", Balance: Rs. " + acc.getBalance()
            );
        }
    }
}
