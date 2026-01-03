package com.ewalletapplication;

//class to represent a Transaction
public class Transaction {
	//transaction attributes
    private String type;
    private double amount;

    //constructor to initialize attributes
    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    //overriding toString() method to print transaction
    public String toString() {
        return String.format("%-15s : %.2f", type, amount);
    }
}


