package com.swiftcart;

public class SwiftCartApp {

    public static void main(String[] args) {

    	//creating product objects
        Product milk = new PerishableProduct("Milk", 50, 2);
        Product rice = new NonPerishableProduct("Rice", 60, 5);

        //creating cart object
        Cart cart = new Cart();
        cart.addProduct(milk);
        cart.addProduct(rice);

        cart.applyDiscount();
        cart.generateBill();
    }
}
