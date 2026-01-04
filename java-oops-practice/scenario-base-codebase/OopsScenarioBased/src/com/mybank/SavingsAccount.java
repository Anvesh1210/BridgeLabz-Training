package com.mybank;

//class to represent a Savings Account
public class SavingsAccount extends Account {

	//defining interest rate 
    private static final double INTEREST_RATE = 4.0; // 4%

    //constructor to initialize attributes
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    //overridden method to calculate interest
    @Override
    public void calculateInterest() {
        double interest = checkBalance() * INTEREST_RATE / 100;
        setBalance(checkBalance() + interest);
        System.out.println("Savings Account Interest Added: " + interest);
        System.out.println("Updated Balance: " + checkBalance());
    }
}

