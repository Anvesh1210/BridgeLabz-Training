package com.transactionmanagement;

import java.sql.Timestamp;

public class Transaction {

	private int txnId;
	private int fromAccount;
	private int toAccount;
	private double amount;
	private Timestamp txnDate;

	public Transaction(int txnId, int fromAccount, int toAccount, double amount, Timestamp txnDate) {
		this.txnId = txnId;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.amount = amount;
		this.txnDate = txnDate;
	}

	@Override
	public String toString() {
		return "TxnID=" + txnId + ", From=" + fromAccount + ", To=" + toAccount + ", Amount=" + amount + ", Date="
				+ txnDate;
	}
}
