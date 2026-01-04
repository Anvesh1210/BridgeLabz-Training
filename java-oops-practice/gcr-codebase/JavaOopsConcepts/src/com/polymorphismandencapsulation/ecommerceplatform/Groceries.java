package com.polymorphismandencapsulation.ecommerceplatform;

//groceries product with discount only (no tax)
public class Groceries extends Product {

 public Groceries(String productId, String name, double price) {
     super(productId, name, price);
 }

 //discount on groceries
 @Override
 public double calculateDiscount() {
     return getPrice() * 0.05;
 }
}

