package com.generics.smartwarehousemanagementsystem;

public abstract class WarehouseItem {
	//attributes
	protected String name;
	
	//constructor to initialize attributes
	public WarehouseItem(String name) {
		this.name = name;
	}

	//getter and setter methods for name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void display();
}
