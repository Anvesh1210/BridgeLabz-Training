package com.swiftcart;

//Interface used in subclasses
public interface ICheckout {
	//method to generate bill
    void generateBill();
    //method to apply discount
    void applyDiscount();
}

