package com.inheritance.leveltwo;

public class Order {

    // protected: accessible to subclasses
    protected String orderId;
    protected String orderDate;

    // public constructor
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // public method
    public String getOrderStatus() {
        return "Order Placed";
    }

    // public method
    public void displayDetails() {
        System.out.println("Order ID    : " + orderId);
        System.out.println("Order Date  : " + orderDate);
        System.out.println("Status      : " + getOrderStatus());
    }
}