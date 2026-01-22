package com.generics.smartwarehousemanagementsystem;

public class Electronics extends WarehouseItem{

	public Electronics(String name) {
		super(name);
	}

	@Override
	public void display() {
		System.out.println("Electronic Item name: "+name);
	}

}
