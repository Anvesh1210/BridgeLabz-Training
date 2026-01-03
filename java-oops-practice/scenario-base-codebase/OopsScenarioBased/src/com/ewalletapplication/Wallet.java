package com.ewalletapplication;

import java.util.ArrayList;

//class to represent wallet
public abstract class Wallet implements Transferrable {
	//wallet attributes
    private double balance;
    
    //arraylist to store transaction
    protected ArrayList<Transaction> transactions = new ArrayList<>();

    //wallet constructor to initialize initial Balance
    public Wallet(double initialBalance) {
        this.balance = initialBalance;
        transactions.add(new Transaction("Initial Load", initialBalance));
    }

    //credit() method to credit balance
    protected void credit(double amount) {
        balance += amount;
        transactions.add(new Transaction("Credit", amount));
    }

    //debit() method to debit balance
    protected boolean debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction("Debit", amount));
            return true;
        }
        return false;
    }

    //getter method to get balance
    public double getBalance() {
        return balance;
    }

    //method to print transaction details
    public void printTransactions() {
        System.out.println("----------------------------------");
        System.out.println("        TRANSACTION HISTORY        ");
        System.out.println("----------------------------------");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
        System.out.println("----------------------------------");
    }
}
