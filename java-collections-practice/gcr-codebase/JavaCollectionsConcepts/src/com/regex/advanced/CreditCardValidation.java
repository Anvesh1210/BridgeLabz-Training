package com.regex.advanced;

//program to validate a credit card
public class CreditCardValidation {
    public static void main(String[] args) {
        String cardNumber = "4123456789012345";
        String regex = "^(4\\d{15}|5\\d{15})$";
        System.out.println(cardNumber.matches(regex) ? "Valid Card" : "Invalid Card");
    }
}
