package com.designprinciples.levelone;

import java.util.ArrayList;
import java.util.List;

public class Order{
	private int orderId;
    private List<Product> productList; // Aggregation: List of products
    private boolean isFinalized;

    public Order(int orderId) {
        this.orderId = orderId;
        this.productList = new ArrayList<>();
        this.isFinalized = false;
    }

    // Method to add products to the "shopping cart"
    public void addProduct(Product p) {
        if (!isFinalized) {
            productList.add(p);
            System.out.println("Added " + p.getName() + " to Order " + orderId);
        } else {
            System.out.println("Cannot add items. Order " + orderId + " is already placed.");
        }
    }

    // Communication: Order talks to Products to calculate total
    public double calculateTotal() {
        double total = 0;
        for (Product p : productList) {
            total += p.getPrice();
        }
        return total;
    }

    public int getOrderId() {
        return orderId;
    }

    public void finalizeOrder() {
        this.isFinalized = true;
    }

    // Display the full receipt
    public void showOrderDetails() {
        System.out.println("\n--- Order Receipt #" + orderId + " ---");
        for (Product p : productList) {
            System.out.println("- " + p.toString());
        }
        System.out.println("Total Amount: " + calculateTotal());
    }
}
