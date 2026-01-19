package com.payxpress;

//interface for bill payment actions
public interface IPayable {
    //method for paying bill
    void pay(double penalty);
    //method for sending reminder
    void sendReminder();
}
