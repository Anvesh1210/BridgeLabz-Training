package com.junit.advanced;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//class to check password validity
class PasswordValidatorTest {
	private PasswordValidator validator;

	// runs before each test
	@BeforeEach
	void setUp() {
		validator = new PasswordValidator();
	}

	// writing test cases
	// valid password test
	@Test
	@DisplayName("Valid Password Test")
	void testValidPassword() {
		assertTrue(validator.isValid("Password1"));
	}

	// less than 8 characters
	@Test
	@DisplayName("Invalid Password - Short Length")
	void testShortPassword() {
		assertFalse(validator.isValid("Pass1"));
	}

	// no uppercase letter
	@Test
	@DisplayName("Invalid Password - No Uppercase")
	void testNoUppercase() {
		assertFalse(validator.isValid("password1"));
	}

	// no digit
	@Test
	@DisplayName("Invalid Password - No Digit")
	void testNoDigit() {
		assertFalse(validator.isValid("Password"));
	}

	// null password
	@Test
	@DisplayName("Invalid Password - Null")
	void testNullPassword() {
		assertFalse(validator.isValid(null));
	}
}
