package com.junit.basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//testing db connectivity
class DatabaseConnectionTest {
	private DatabaseConnection dbConnection;

	// writing testcases
	@BeforeEach
	void setUp() {
		dbConnection = new DatabaseConnection();
		dbConnection.connect();
	}

	@AfterEach
	void tearDown() {
		dbConnection.disconnect();
	}

	@Test
	@DisplayName("Database connection should be established before each test")
	void testConnectionEstablished() {
		assertTrue(dbConnection.isConnected());
	}

	@Test
	@DisplayName("Database connection should be closed after each test")
	void testConnectionClosed() {
		assertTrue(dbConnection.isConnected());
	}
}
