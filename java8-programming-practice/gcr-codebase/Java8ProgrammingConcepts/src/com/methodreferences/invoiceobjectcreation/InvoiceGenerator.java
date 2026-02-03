package com.methodreferences.invoiceobjectcreation;

import java.util.*;

//InvoiceGenerator class for generating invoice
public class InvoiceGenerator {
	public static void main(String[] args) {
		//List of transaction id's
		List<String> transactionIds = Arrays.asList("TXN1001", "TXN1002", "TXN1003");

		// Constructor Reference
		List<Invoice> invoices = transactionIds.stream().map(Invoice::new).toList();
		invoices.forEach(System.out::println);
	}
}
