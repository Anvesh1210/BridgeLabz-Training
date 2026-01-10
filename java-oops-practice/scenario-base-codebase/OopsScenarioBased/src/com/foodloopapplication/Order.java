package com.foodloopapplication;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrderable {

    private int orderId;
    private List<FoodItem> items;
    private double total;
    private String orderStatus;

    public Order(int orderId) {
        this.orderId = orderId;
        items = new ArrayList<>();
        orderStatus = "Not Placed";
    }

    public void addItem(FoodItem item) {
        if (item.checkAvailability(1)) {
            items.add(item);
            total += item.getPrice(); // operator usage
        } else {
            System.out.println(item.getName() + " is out of stock");
        }
    }

    // Polymorphism-ready discount logic
    public double applyDiscount() {
        if (total >= 500) {
            return total * 0.10;
        }
        return 0;
    }

    @Override
    public void placeOrder() {
        if (items.isEmpty()) {
            System.out.println("No items in order");
            return;
        }
        for (FoodItem item : items) {
            item.decreaseStock(1);
            item.displayDetails();
        }
        double discount = applyDiscount();
        double finalAmount = total - discount;

        System.out.println("Order ID: " + orderId);
        System.out.println("Total: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);

        orderStatus = "Placed";
    }

    @Override
    public void cancelOrder() {
        if (!orderStatus.equals("Placed")) {
            System.out.println("Order not placed yet");
        } else {
            items.clear();
            total = 0;
            orderStatus = "Cancelled";
            System.out.println("Order Cancelled");
        }
    }
}
