package com.polymorphismandencapsulation.ecommerceplatform;

//clothing product with tax and discount
public class Clothing extends Product implements Taxable {

 public Clothing(String productId, String name, double price) {
     super(productId, name, price);
 }

 //seasonal discount
 @Override
 public double calculateDiscount() {
     return getPrice() * 0.20;
 }

 //GST on clothing
 @Override
 public double calculateTax() {
     return getPrice() * 0.05;
 }

 @Override
 public String getTaxDetails() {
     return "5% GST applied on Clothing";
 }
}

