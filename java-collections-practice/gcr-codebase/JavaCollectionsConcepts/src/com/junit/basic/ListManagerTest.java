package com.junit.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListManagerTest {

	//creating ListManager and List
	private ListManager listManager;
	private List<Integer> list;

	//writing testcases
	@BeforeEach
	void setUp() {
		listManager = new ListManager();
		list = new ArrayList<>();
	}

	@Test
	@DisplayName("Add Element to List")
	void testAddElement() {
		listManager.addElement(list, 10);
		listManager.addElement(list, 20);
		assertEquals(2, listManager.getSize(list));
		assertTrue(list.contains(10));
		assertTrue(list.contains(20));
	}

	@Test
	@DisplayName("Remove Element from List")
	void testRemoveElement() {
		list.add(10);
		list.add(20);
		list.add(30);
		listManager.removeElement(list, 20);
		assertEquals(2, listManager.getSize(list));
		assertFalse(list.contains(20));
	}

	@Test
	@DisplayName("List Size Update Test")
	void testGetSize() {
		assertEquals(0, listManager.getSize(list));
		listManager.addElement(list, 5);
		listManager.addElement(list, 15);
		assertEquals(2, listManager.getSize(list));
	}
}
