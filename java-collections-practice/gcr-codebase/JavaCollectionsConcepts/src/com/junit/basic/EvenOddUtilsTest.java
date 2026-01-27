package com.junit.basic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddUtilsTest {
	@ParameterizedTest
	@ValueSource(ints = { 2, 4, 6 })
	void testEvenNumbers(int number) {
		EvenOddUtils utils = new EvenOddUtils();
		assertTrue(utils.isEven(number));
	}

	@ParameterizedTest
	@ValueSource(ints = { 7, 9 })
	void testOddNumbers(int number) {
		EvenOddUtils utils = new EvenOddUtils();
		assertFalse(utils.isEven(number));
	}
}