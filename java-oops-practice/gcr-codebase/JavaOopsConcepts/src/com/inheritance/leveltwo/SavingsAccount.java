package com.inheritance.leveltwo;

//Represents a savings bank account
public class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor to initialize savings account
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Call parent constructor
        this.interestRate = interestRate;
    }

    // Displays savings account specific details
    @Override
    public void displayAccountType() {
        System.out.println("Account Type   : Savings Account");
        System.out.println("Interest Rate : " + interestRate + "%");
    }
}
