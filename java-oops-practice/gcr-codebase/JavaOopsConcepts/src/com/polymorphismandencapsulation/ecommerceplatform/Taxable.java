package com.polymorphismandencapsulation.ecommerceplatform;

public interface Taxable {
	//method to calculate tax amount on product
    double calculateTax();

    //method to return tax details
    String getTaxDetails();
}
