package com.mybank;

//class to represent a Bank Account
public abstract class Account implements ITransaction {

	//Account attributes
    protected String accountNumber;
    private double balance;

    //constructor without opening balance
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    //constructor with opening balance
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //encapsulated balance access
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    //overridden method to check the balance
    @Override
    public double checkBalance() {
        return balance;
    }

    //overridden method to deposit balance
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Updated balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    //overridden method to withdraw money
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    //method to calculate interest
    public abstract void calculateInterest();
}
