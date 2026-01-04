package com.polymorphismandencapsulation.ecommerceplatform;

//utility class to calculate and display final price
public class BillingService {

 //polymorphic method: works for all Product types
 public static void printFinalPrice(Product product) {

     double tax = 0;

     // Check if product is taxable
     if (product instanceof Taxable) {
         Taxable taxable = (Taxable) product;
         tax = taxable.calculateTax();
         System.out.println(taxable.getTaxDetails());
     }

     double discount = product.calculateDiscount();
     double finalPrice = product.getPrice() + tax - discount;

     System.out.println("Product Name : " + product.getName());
     System.out.println("Base Price  : " + product.getPrice());
     System.out.println("Discount    : " + discount);
     System.out.println("Tax         : " + tax);
     System.out.println("Final Price : " + finalPrice);
     System.out.println("----------------------------------");
 }
}

