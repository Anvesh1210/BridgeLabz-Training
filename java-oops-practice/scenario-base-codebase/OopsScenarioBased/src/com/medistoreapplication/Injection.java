package com.medistoreapplication;

import java.time.LocalDate;

//method to represent a Injection 
public class Injection extends Medicine {
	//constructor to initialize attributes
    public Injection(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate, 30);
    }

    @Override
    public boolean checkExpiry() {
        //very strict expiry rule
        return expiryDate.isAfter(LocalDate.now().plusDays(3));
    }
}

