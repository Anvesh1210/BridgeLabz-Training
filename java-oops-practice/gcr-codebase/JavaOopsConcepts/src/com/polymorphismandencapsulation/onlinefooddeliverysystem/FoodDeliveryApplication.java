package com.polymorphismandencapsulation.onlinefooddeliverysystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodDeliveryApplication {
    public static void main(String[] args) {
    		
    	//creating Scanner object
        Scanner sc = new Scanner(System.in);
        List<FoodItem> order = new ArrayList<>();

        //asking the user how many items he wants to order
        System.out.print("How many food items do you want to order? ");
        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {

            System.out.println("\nSelect Food Type:");
            System.out.println("1. Veg Item");
            System.out.println("2. Non-Veg Item");
            int choice = sc.nextInt();

            if (choice != 1 && choice != 2) {
                System.out.println("❌ Wrong input! Please choose 1 or 2.");
                i--;
                continue;
            }

            System.out.print("Enter Item Name: ");
            String name = sc.next();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();

            FoodItem item;

            if (choice == 1) {
                item = new VegItem(name, price, qty);
            } else {
                item = new NonVegItem(name, price, qty);
            }

            order.add(item);
        }

        System.out.println("\n----- Order Summary -----");

        double grandTotal = 0;

        //printing details
        for (FoodItem item : order) {

            item.getItemDetails();

            double total = item.calculateTotalPrice();
            double discount = 0;

            System.out.println("Total Price : " + total);

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                discount = d.applyDiscount();
                System.out.println(d.getDiscountDetails());
                System.out.println("Discount    : " + discount);
            }

            double finalAmount = total - discount;
            System.out.println("Final Amount: " + finalAmount);

            grandTotal += finalAmount;
            System.out.println("--------------------------");
        }

        System.out.println("Grand Total Payable: " + grandTotal);

        sc.close();
    }
}
