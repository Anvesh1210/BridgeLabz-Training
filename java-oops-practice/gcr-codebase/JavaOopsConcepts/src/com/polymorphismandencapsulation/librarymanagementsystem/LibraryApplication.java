package com.polymorphismandencapsulation.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryApplication {
    public static void main(String[] args) {

    		//creating Scanner object
        Scanner sc = new Scanner(System.in);
        List<LibraryItem> items = new ArrayList<>();

        System.out.print("How many library items do you want to add? ");
        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {

            System.out.println("\nSelect Item Type:");
            System.out.println("1. Book");
            System.out.println("2. Magazine");
            System.out.println("3. DVD");
            int choice = sc.nextInt();

            if (choice < 1 || choice > 3) {
                System.out.println("❌ Wrong input! Please choose 1, 2, or 3.");
                i--;
                continue;
            }

            System.out.print("Enter Item ID: ");
            String id = sc.next();

            System.out.print("Enter Title: ");
            String title = sc.next();

            System.out.print("Enter Author: ");
            String author = sc.next();

            LibraryItem item;

            switch (choice) {
                case 1:
                    item = new Book(id, title, author);
                    break;
                case 2:
                    item = new Magazine(id, title, author);
                    break;
                default:
                    item = new DVD(id, title, author);
            }

            items.add(item);
        }

        System.out.println("\n----- Library Item Processing -----");

        //printing details
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration : " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available     : " + r.checkAvailability());
                r.reserveItem();
            }

            System.out.println("----------------------------------");
        }

        //closing Scanner object
        sc.close();
    }
}
