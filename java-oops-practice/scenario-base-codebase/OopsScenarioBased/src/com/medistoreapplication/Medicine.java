package com.medistoreapplication;

import java.time.LocalDate;

public abstract class Medicine implements ISellable {
	//medicine class attributes 
    protected String name;
    protected LocalDate expiryDate;

    private double price;     
    private int quantity; 

    //constructor to initialize attributes
    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 50);
    }

    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    //sensitive pricing logic
    private double calculateTotal(int units) {
        double total = price * units;
        if (total > 500) {
            total -= total * 0.10;
        }
        return total;
    }

    @Override
    public void sell(int units) {
        if (units <= quantity && checkExpiry()) {
            quantity -= units;
            System.out.println(units + " units sold of " + name);
            System.out.println("Total Bill: ₹" + calculateTotal(units));
            System.out.println("Remaining Stock: " + quantity);
        } else {
            System.out.println("Sale failed for " + name);
        }
    }
}

