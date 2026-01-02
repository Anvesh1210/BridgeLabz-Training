package com.inheritance.leveltwo;

//Main class
public class RestaurantManagementSystem {
    public static void main(String[] args) {
    // Creating objects using Persen2 reference
    Persen2 p1 = new Chef("Rahul", 101, "Indian");
    Persen2 p2 = new Waiter("Amit", 102, 6);
    System.out.println("---- Restaurant Staff ----\n");
    p1.displayDetails();
    ((Worker) p1).performDuties();
	System.out.println();
	p2.displayDetails();
	((Worker) p2).performDuties();
	}
}
