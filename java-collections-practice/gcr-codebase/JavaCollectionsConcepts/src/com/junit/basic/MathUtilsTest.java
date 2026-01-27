package com.junit.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
	
	//testcases for devide function
	@Test
	@DisplayName("Divide by Zero should throw ArithmeticException")
	void testDivideByZeroException() {
		MathUtil mathUtils = new MathUtil();
		ArithmeticException exception = assertThrows(ArithmeticException.class, () -> mathUtils.divide(10, 0));
		assertEquals("Division by zero is not allowed", exception.getMessage());
	}

	@Test
	@DisplayName("Valid Division Test")
	void testValidDivision() {
		MathUtil mathUtils = new MathUtil();
		assertEquals(5, mathUtils.divide(10, 2));
	}
}
