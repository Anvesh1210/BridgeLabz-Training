package com.inheritance.leveltwo;

//Base class for all bank accounts
public class BankAccount {
    protected String accountNumber;
    protected double balance;

    // Constructor to initialize account details
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Displays basic account information
    public void displayBasicDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
    }

    // Method to display account type 
    public void displayAccountType() {
        System.out.println("Account Type   : Bank Account");
    }
}