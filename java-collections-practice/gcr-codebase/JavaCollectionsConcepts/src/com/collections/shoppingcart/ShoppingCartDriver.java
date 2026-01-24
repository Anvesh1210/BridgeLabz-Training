package com.collections.shoppingcart;

//class to use Shopping Cart
public class ShoppingCartDriver {
	public static void main(String[] args) {

		//creating cart
        ShoppingCart cart = new ShoppingCart();

        //creating products
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mouse", 500);
        Product p3 = new Product("Keyboard", 1200);
        Product p4 = new Product("Headphones", 2500);

        //adding products in cart
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);
        cart.addProduct(p4);

        //printing products
        System.out.println();
        cart.displayCartInOrder();

        System.out.println();
        cart.displayItemsSortedByPrice();

        System.out.println("\nTotal Price: ₹" + cart.getTotalPrice());
    }
}
