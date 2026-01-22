package com.generics.smartwarehousemanagementsystem;

public class Furniture extends WarehouseItem{

	public Furniture(String name) {
		super(name);
	}

	@Override
	public void display() {
		System.out.println("Furniture name: "+name);
	}

}
