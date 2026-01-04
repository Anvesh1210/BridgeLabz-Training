package com.mybank;

//Interface used in subclasses
public interface ITransaction {
	void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}
