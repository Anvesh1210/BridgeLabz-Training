package com.medistoreapplication;

import java.time.LocalDate;

//class to represent Tablets
public class Tablet extends Medicine {
	//constructor to initialize attributes
    public Tablet(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    //method to check expiry
    @Override
    public boolean checkExpiry() {
        return expiryDate.isAfter(LocalDate.now());
    }
}

