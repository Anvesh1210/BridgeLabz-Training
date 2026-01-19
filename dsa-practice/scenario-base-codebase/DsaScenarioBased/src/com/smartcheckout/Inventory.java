package com.smartcheckout;

import java.util.*;

//class managing item price and stock
public class Inventory {

	// attributes for Inventory
	private HashMap<String, Double> priceMap;
	private HashMap<String, Integer> stockMap;

	// constructor for inventory setup
	public Inventory() {
		priceMap = new HashMap<>();
		stockMap = new HashMap<>();
	}

	// method for adding item to inventory
	public void addItem(String item, double price, int stock) {
		priceMap.put(item, price);
		stockMap.put(item, stock);
	}

	// method for fetching item price
	public double getPrice(String item) {
		return priceMap.getOrDefault(item, 0.0);
	}

	// method for reducing stock after purchase
	public void reduceStock(String item) {
		if (stockMap.containsKey(item)) {
			stockMap.put(item, stockMap.get(item) - 1);
		}
	}

	// method for checking available stock
	public int getStock(String item) {
		return stockMap.getOrDefault(item, 0);
	}
}
