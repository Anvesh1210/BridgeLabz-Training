package com.mybank;

//class to represent a Current Account
public class CurrentAccount extends Account {

	//Defining a fixed interest rate field
    private static final double INTEREST_RATE = 2.0; // 2%

    //constructor to initialize fields
    public CurrentAccount(String accountNumber) {
        super(accountNumber);
    }

    //overridden method to calculate interest
    @Override
    public void calculateInterest() {
        double interest = checkBalance() * INTEREST_RATE / 100;
        setBalance(checkBalance() + interest);
        System.out.println("Current Account Interest Added: " + interest);
        System.out.println("Updated Balance: " + checkBalance());
    }
}

