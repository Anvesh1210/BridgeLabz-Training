package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

public class InventoryList {
	private ItemNode head;

    //method to add at beginning
    void addAtBeginning(int id, String name, int qty, double price) {
        ItemNode n = new ItemNode(id, name, qty, price);
        n.next = head;
        head = n;
    }

    //method to add at end
    void addAtEnd(int id, String name, int qty, double price) {
        ItemNode n = new ItemNode(id, name, qty, price);

        if (head == null) {
            head = n;
            return;
        }

        ItemNode t = head;
        while (t.next != null)
            t = t.next;

        t.next = n;
    }

    //method to add at position
    void addAtPosition(int pos, int id, String name, int qty, double price) {

        if (pos <= 0) return;

        if (pos == 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        ItemNode t = head;
        for (int i = 1; i < pos - 1 && t != null; i++)
            t = t.next;

        if (t == null) return;

        ItemNode n = new ItemNode(id, name, qty, price);
        n.next = t.next;
        t.next = n;
    }

    //method to remove by Item ID
    void removeById(int id) {

        if (head == null) return;

        if (head.itemId == id) {
            head = head.next;
            return;
        }

        ItemNode t = head;
        while (t.next != null && t.next.itemId != id)
            t = t.next;

        if (t.next != null)
            t.next = t.next.next;
    }

    //method to update quantity
    void updateQuantity(int id, int newQty) {
        ItemNode t = head;
        while (t != null) {
            if (t.itemId == id) {
                t.quantity = newQty;
                return;
            }
            t = t.next;
        }
    }

    //method to search by ID
    void searchById(int id) {
        ItemNode t = head;
        while (t != null) {
            if (t.itemId == id) {
                displayItem(t);
                return;
            }
            t = t.next;
        }
        System.out.println("Item not found");
    }

    //method to search by Name
    void searchByName(String name) {
        ItemNode t = head;
        while (t != null) {
            if (t.itemName.equalsIgnoreCase(name))
                displayItem(t);
            t = t.next;
        }
    }

    //method to total inventory value
    void totalInventoryValue() {
        double total = 0;
        ItemNode t = head;

        while (t != null) {
            total += t.price * t.quantity;
            t = t.next;
        }

        System.out.println("Total Inventory Value: " + total);
    }

    //method to sort by Name
    void sortByName(boolean asc) {
        head = mergeSort(head, asc, true);
    }

    //method to sort by Price
    void sortByPrice(boolean asc) {
        head = mergeSort(head, asc, false);
    }

    //method to merge Sort
    private ItemNode mergeSort(ItemNode h, boolean asc, boolean byName) {

        if (h == null || h.next == null)
            return h;

        ItemNode mid = getMiddle(h);
        ItemNode next = mid.next;
        mid.next = null;

        ItemNode left = mergeSort(h, asc, byName);
        ItemNode right = mergeSort(next, asc, byName);

        return merge(left, right, asc, byName);
    }

    private ItemNode merge(ItemNode a, ItemNode b, boolean asc, boolean byName) {

        if (a == null) return b;
        if (b == null) return a;

        boolean condition;

        if (byName)
            condition = asc ?
                a.itemName.compareToIgnoreCase(b.itemName) <= 0 :
                a.itemName.compareToIgnoreCase(b.itemName) > 0;
        else
            condition = asc ? a.price <= b.price : a.price > b.price;

        if (condition) {
            a.next = merge(a.next, b, asc, byName);
            return a;
        } else {
            b.next = merge(a, b.next, asc, byName);
            return b;
        }
    }

    private ItemNode getMiddle(ItemNode h) {
        ItemNode slow = h, fast = h.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //method to display inventory
    void displayAll() {
        ItemNode t = head;
        while (t != null) {
            displayItem(t);
            t = t.next;
        }
    }

    private void displayItem(ItemNode i) {
        System.out.println(
            "ID: " + i.itemId +
            ", Name: " + i.itemName +
            ", Qty: " + i.quantity +
            ", Price: " + i.price
        );
    }
}
