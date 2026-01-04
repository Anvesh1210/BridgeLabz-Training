package com.polymorphismandencapsulation.ecommerceplatform;

//electronics product with tax and discount
public class Electronics extends Product implements Taxable {

 public Electronics(String productId, String name, double price) {
     super(productId, name, price);
 }

 //discount on electronics
 @Override
 public double calculateDiscount() {
     return getPrice() * 0.10;
 }

 //GST on electronics
 @Override
 public double calculateTax() {
     return getPrice() * 0.18;
 }

 @Override
 public String getTaxDetails() {
     return "18% GST applied on Electronics";
 }
}

