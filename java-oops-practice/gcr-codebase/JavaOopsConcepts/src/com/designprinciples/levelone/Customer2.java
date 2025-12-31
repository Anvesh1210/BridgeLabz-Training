package com.designprinciples.levelone;

import java.util.ArrayList;
import java.util.List;

public class Customer2 {
	private String name;
    private List<Order> orderHistory; // Association: Customer remembers their orders

    public Customer2(String name) {
        this.name = name;
        this.orderHistory = new ArrayList<>();
    }

    // Action: Customer places the order
    public void placeOrder(Order order) {
        // Communication logic
        order.finalizeOrder();
        orderHistory.add(order);
        
        System.out.println("Action: " + this.name + " has successfully placed Order #" + order.getOrderId());
        
        // Trigger the order to display its own details
        order.showOrderDetails();
    }
}
