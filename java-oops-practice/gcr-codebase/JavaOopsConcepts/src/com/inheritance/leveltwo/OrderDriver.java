package com.inheritance.leveltwo;

public class OrderDriver {
	public static void main(String[] args) {

        Order o1 = new Order("ORD101", "10-Jan-2026");
        Order o2 = new ShippedOrder("ORD102", "11-Jan-2026", "TRK56789");
        Order o3 = new DeliveredOrder("ORD103", "12-Jan-2026",
                                      "TRK98765", "15-Jan-2026");

        System.out.println("---- Order Details ----\n");

        o1.displayDetails();
        System.out.println();

        o2.displayDetails();
        System.out.println();

        o3.displayDetails();
    }
}
