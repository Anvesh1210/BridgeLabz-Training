package com.generics.smartwarehousemanagementsystem;

public class Groceries extends WarehouseItem{

	public Groceries(String name) {
		super(name);
	}

	@Override
	public void display() {
		System.out.println("Groceries Item name :"+name);
	}

}
