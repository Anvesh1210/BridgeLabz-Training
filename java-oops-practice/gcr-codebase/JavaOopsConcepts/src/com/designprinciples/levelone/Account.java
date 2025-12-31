package com.designprinciples.levelone;

public class Account {
	private int accountNumber;
    private double balance;
    private Bank bank;

    public Account(int accountNumber, double balance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getBankName() {
        return bank.getBankName();
    }
}
