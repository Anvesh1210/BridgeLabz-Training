package com.inheritance.leveltwo;

//Represents a fixed deposit account
public class FixedDepositAccount extends BankAccount {
    private int tenureMonths;
    private double interestRate;

    // Constructor to initialize fixed deposit account
    public FixedDepositAccount(String accountNumber, double balance,
                               int tenureMonths, double interestRate) {
        super(accountNumber, balance); // Call parent constructor
        this.tenureMonths = tenureMonths;
        this.interestRate = interestRate;
    }

    // Displays fixed deposit account specific details
    @Override
    public void displayAccountType() {
        System.out.println("Account Type  : Fixed Deposit Account");
        System.out.println("Tenure       : " + tenureMonths + " months");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}