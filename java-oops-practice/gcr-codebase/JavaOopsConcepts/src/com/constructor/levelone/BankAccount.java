package com.constructor.levelone;

public class BankAccount {

    //data members with access modifiers
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    //constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        setBalance(balance); // use setter
    }

    //public getter for balance
    public double getBalance() {
        return balance;
    }

    //public setter for balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance! Setting to 0.");
            this.balance = 0;
        }
    }

    //deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    //withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid or insufficient balance!");
        }
    }

    //display basic details
    public void displayAccount() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : ₹" + balance);
    }
}

