package com.swiftcart;

import java.util.ArrayList;

//class to represent cart
public class Cart implements ICheckout {

    private ArrayList<Product> products;
    private double totalPrice;

    //empty cart
    Cart() {
        products = new ArrayList<>();
    }

    //cart with pre-selected items
    Cart(ArrayList<Product> products) {
        this.products = products;
        calculateTotal();
    }

    public void addProduct(Product product) {
        products.add(product);
        calculateTotal();
    }

    //only Cart can update prices
    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getTotalPrice();
        }
    }

    @Override
    public void applyDiscount() {
        double totalDiscount = 0;

        for (Product p : products) {
            totalDiscount += p.getDiscount(); // polymorphism
        }

        totalPrice = totalPrice - totalDiscount; // operator used
    }

    @Override
    public void generateBill() {
        System.out.println("\n----- SwiftCart Bill -----");

        for (Product p : products) {
            System.out.println(
                p.name + " | Qty: " + p.quantity + " | Price: " + p.price +" | Total: " + p.getTotalPrice());
        }

        System.out.println("Final Payable Amount: ₹" + totalPrice);
    }
}
