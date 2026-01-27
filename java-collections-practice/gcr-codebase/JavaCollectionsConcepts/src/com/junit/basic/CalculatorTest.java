package com.junit.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
	private Calculator calculator;
	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}

	@Test
	@DisplayName("Addition Test")
	void testAdd() {
		assertEquals(10, calculator.add(5, 5));
	}

	@Test
	@DisplayName("Subtraction Test")
	void testSubtract() {
		assertEquals(2, calculator.subtract(5, 3));
	}

	@Test
	@DisplayName("Multiplication Test")
	void testMultiply() {
		assertEquals(20, calculator.multiply(4, 5));
	}

	@Test
	@DisplayName("Division Test")
	void testDivide() {
		assertEquals(4, calculator.divide(20, 5));
	}

	// Exception Testing
	@Test
	@DisplayName("Division by Zero Exception Test")
	void testDivideByZero() {
		assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
	}
}
