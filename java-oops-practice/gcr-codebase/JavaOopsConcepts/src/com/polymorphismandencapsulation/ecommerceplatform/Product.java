package com.polymorphismandencapsulation.ecommerceplatform;

//Abstract base class representing a generic product
public abstract class Product {

 //data members
 private String productId;
 private String name;
 private double price;

 //constructor to initialize product details
 public Product(String productId, String name, double price) {
     this.productId = productId;
     this.name = name;
     this.price = price;
 }

 //getter methods
 public String getProductId() {
     return productId;
 }

 public String getName() {
     return name;
 }

 public double getPrice() {
     return price;
 }

 //setter to update price safely
 public void setPrice(double price) {
     if (price > 0) {
         this.price = price;
     }
 }

 //abstract method to calculate discount
 public abstract double calculateDiscount();
}

