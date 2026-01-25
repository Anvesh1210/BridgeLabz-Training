package com.sorting.tailorshop;

public class TailorShopDriver {
    public static void main(String[] args) {
        TailorShop manager = new TailorShop();
        manager.addOrder(new Order("ORD101", 5));
        manager.addOrder(new Order("ORD102", 2));
        manager.addOrder(new Order("ORD103", 7));
        manager.addOrder(new Order("ORD104", 3));
        manager.addOrder(new Order("ORD105", 1));
        
        //displaying orders
        System.out.println("Orders Sorted by Delivery Deadline:");
        manager.displayOrders();
    }
}
