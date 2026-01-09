package com.medistoreapplication;

import java.time.LocalDate;

public class MediStoreApplication {
    public static void main(String[] args) {
    	//creating multiple object
        Medicine tablet = new Tablet("Paracetamol",20,LocalDate.now().plusMonths(6));
        Medicine syrup = new Syrup("Cough Syrup",120,LocalDate.now().plusDays(10));
        Medicine injection = new Injection("Insulin",300,LocalDate.now().plusDays(5));

        System.out.println("---- SALES TRANSACTIONS ----\n");

        tablet.sell(30);
        System.out.println();

        syrup.sell(5);
        System.out.println();

        injection.sell(3);
    }
}
