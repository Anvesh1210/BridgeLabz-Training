package com.medistoreapplication;

import java.time.LocalDate;

//class to represent syrup
public class Syrup extends Medicine {
	//constructor to initialize attributes
    public Syrup(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    //method to check expiry
    @Override
    public boolean checkExpiry() {
        // Liquid meds expire earlier (buffer of 7 days)
        return expiryDate.isAfter(LocalDate.now().plusDays(7));
    }
}

