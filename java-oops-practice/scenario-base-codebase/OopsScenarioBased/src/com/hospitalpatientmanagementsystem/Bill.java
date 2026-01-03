package com.hospitalpatientmanagementsystem;

//class to represent Bill
public class Bill implements Payable {
	
	//bill Attributes
    private double baseAmount;
    private double taxRate;
    private double discountRate;

    //constructor to initialize bill attributes
    public Bill(double baseAmount, double taxRate, double discountRate) {
        this.baseAmount = baseAmount;
        this.taxRate = taxRate;
        this.discountRate = discountRate;
    }

    //overriding calculatePayment() method to calculate total bill
    @Override
    public double calculatePayment() {
        double tax = baseAmount * taxRate;
        double discount = baseAmount * discountRate;
        return baseAmount + tax - discount;
    }
}

