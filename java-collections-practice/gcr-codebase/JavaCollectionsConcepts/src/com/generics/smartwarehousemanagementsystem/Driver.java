package com.generics.smartwarehousemanagementsystem;

public class Driver {
	public static void main(String[] args) {

        // Storage for Electronics
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        // Storage for Groceries
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice"));
        groceriesStorage.addItem(new Groceries("Milk"));

        // Storage for Furniture
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Table"));
        furnitureStorage.addItem(new Furniture("Chair"));
        
        electronicsStorage.displayAllItems(electronicsStorage.getAllItems());
        groceriesStorage.displayAllItems(groceriesStorage.getAllItems());
        furnitureStorage.displayAllItems(furnitureStorage.getAllItems());
    }
}
