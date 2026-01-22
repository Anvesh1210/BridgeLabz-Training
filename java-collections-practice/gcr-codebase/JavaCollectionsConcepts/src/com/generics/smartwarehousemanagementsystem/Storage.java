package com.generics.smartwarehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {
	
	List<T> items;
	
	public Storage(){
		items = new ArrayList<>();
	}
	
	public void addItem(T item) {
		items.add(item);
	}
	
	public List<T> getAllItems() {
		return items;
	}
	
	public void displayAllItems(List<? extends WarehouseItem> items) {
		for(WarehouseItem item:items) {
			item.display();
		}
	}
}
