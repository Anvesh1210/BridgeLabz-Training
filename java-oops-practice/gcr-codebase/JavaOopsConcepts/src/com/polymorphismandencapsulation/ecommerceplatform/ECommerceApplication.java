package com.polymorphismandencapsulation.ecommerceplatform;

public class ECommerceApplication {
    public static void main(String[] args) {

        // Creating different product objects
        Product laptop = new Electronics("E101", "Laptop", 60000);
        Product tshirt = new Clothing("C201", "T-Shirt", 2000);
        Product rice = new Groceries("G301", "Rice Bag", 1500);

        //polymorphic behavior
        BillingService.printFinalPrice(laptop);
        BillingService.printFinalPrice(tshirt);
        BillingService.printFinalPrice(rice);
    }
}

