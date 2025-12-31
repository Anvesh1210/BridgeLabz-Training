package com.designprinciples.levelone;

public class ECommerseApp {
	public static void main(String[] args) {
		
        //creating product objects
        Product p1 = new Product("Laptop", 1200.00);
        Product p2 = new Product("Mouse", 25.50);
        Product p3 = new Product("Keyboard", 75.00);
        Product p4 = new Product("Monitor", 300.00);

        //creating customer
        Customer2 customer = new Customer2("John Doe");

        //creating an Order
        Order order1 = new Order(101);

        //adding Products to Order (Aggregation)
        order1.addProduct(p1);
        order1.addProduct(p2);
        order1.addProduct(p3);
        
        //placing order
        customer.placeOrder(order1);

        //create a second order to show history
        Order order2 = new Order(102);
        order2.addProduct(p4);
        customer.placeOrder(order2);
    }
}
