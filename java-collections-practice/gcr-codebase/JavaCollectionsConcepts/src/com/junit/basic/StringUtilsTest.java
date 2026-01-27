package com.junit.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
	private StringUtils stringUtils;

	@BeforeEach
	void setUp() {
		stringUtils = new StringUtils();
	}

	// reverse() tests
	@Test
	@DisplayName("Reverse String Test")
	void testReverse() {
		assertEquals("olleh", stringUtils.reverse("hello"));
	}

	@Test
	@DisplayName("Reverse Null String")
	void testReverseNull() {
		assertNull(stringUtils.reverse(null));
	}

	// isPalindrome() tests
	@Test
	@DisplayName("Palindrome True Test")
	void testIsPalindromeTrue() {
		assertTrue(stringUtils.isPalindrome("madam"));
	}

	@Test
	@DisplayName("Palindrome False Test")
	void testIsPalindromeFalse() {
		assertFalse(stringUtils.isPalindrome("hello"));
	}

	@Test
	@DisplayName("Palindrome Null Test")
	void testIsPalindromeNull() {
		assertFalse(stringUtils.isPalindrome(null));
	}

	// toUpperCase() tests
	@Test
	@DisplayName("Convert to Uppercase Test")
	void testToUpperCase() {
		assertEquals("JAVA", stringUtils.toUpperCase("java"));
	}

	@Test
	@DisplayName("Uppercase Null Test")
	void testToUpperCaseNull() {
		assertNull(stringUtils.toUpperCase(null));
	}
}
