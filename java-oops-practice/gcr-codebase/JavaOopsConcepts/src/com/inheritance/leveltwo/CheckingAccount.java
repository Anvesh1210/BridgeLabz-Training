package com.inheritance.leveltwo;

//Represents a checking account
public class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    // Constructor to initialize checking account
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance); // Call parent constructor
        this.withdrawalLimit = withdrawalLimit;
    }

    // Displays checking account specific details
    @Override
    public void displayAccountType() {
        System.out.println("Account Type     : Checking Account");
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}
