package com.junit.advanced;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//class to test Bank Account
class BankAccountTest {
	private BankAccount account;

	// writing test cases for bank account
	@BeforeEach
	void setUp() {
		account = new BankAccount(1000.0);
	}

	@Test
	@DisplayName("Deposit increases account balance")
	void testDeposit() {
		account.deposit(500.0);
		assertEquals(1500.0, account.getBalance());
	}

	@Test
	@DisplayName("Withdraw decreases account balance")
	void testWithdraw() {
		account.withdraw(300.0);
		assertEquals(700.0, account.getBalance());
	}

	@Test
	@DisplayName("Withdraw fails when balance is insufficient")
	void testWithdrawInsufficientFunds() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(2000.0));

		assertEquals("Insufficient funds", exception.getMessage());
	}

	@Test
	@DisplayName("Deposit with negative amount should fail")
	void testInvalidDeposit() {
		assertThrows(IllegalArgumentException.class, () -> account.deposit(-100));
	}

	@Test
	@DisplayName("Withdraw with negative amount should fail")
	void testInvalidWithdraw() {
		assertThrows(IllegalArgumentException.class, () -> account.withdraw(-50));
	}
}
