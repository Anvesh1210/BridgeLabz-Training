package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

//class to represent Item node
public class ItemNode {
	//item attributes
	int itemId;
    String itemName;
    int quantity;
    double price;
    ItemNode next;

    //constructor to initialize attributes
    ItemNode(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
