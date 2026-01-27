package com.junit.advanced;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {
	private UserRegistration registration;

	@BeforeEach
	void setUp() {
		registration = new UserRegistration();
	}

	// writing test cases
	@Test
	@DisplayName("Valid User Registration")
	void testValidRegistration() {
		assertDoesNotThrow(() -> registration.registerUser("john_doe", "john@example.com", "secret123"));
	}

	@Test
	@DisplayName("Invalid Username")
	void testInvalidUsername() {
		assertThrows(IllegalArgumentException.class,
				() -> registration.registerUser("", "john@example.com", "secret123"));
	}

	@Test
	@DisplayName("Invalid Email")
	void testInvalidEmail() {
		assertThrows(IllegalArgumentException.class,
				() -> registration.registerUser("john_doe", "johnexample.com", "secret123"));
	}

	// invalid password
	@Test
	@DisplayName("Invalid Password")
	void testInvalidPassword() {
		assertThrows(IllegalArgumentException.class,
				() -> registration.registerUser("john_doe", "john@example.com", "123"));
	}
}
