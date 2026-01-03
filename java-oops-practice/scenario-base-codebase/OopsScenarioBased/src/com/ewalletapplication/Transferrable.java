package com.ewalletapplication;

//Interface having transferTo() method to complete a transaction
public interface Transferrable {
	void transferTo(User receiver, double amount);
}
