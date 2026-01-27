package com.junit.basic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class PerformanceUtilsTest {
	// test case
	@Test
	@Timeout(2)
	void testLongRunningTask() throws InterruptedException {
		PerformanceUtils utils = new PerformanceUtils();
		assertEquals("Completed", utils.longRunningTask());
	}
}