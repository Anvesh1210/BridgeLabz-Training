package com.hashmap;

public class CustomHashMap {
    //node class which represents one entry in our map
    static class Node {
        String key;
        int value;
        Node next;
        //node constructor which initialize node values
        public Node(String key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Node[] buckets;
    private int capacity;
    private int size;

    public CustomHashMap(int capacity) {
        this.capacity = capacity;
        this.buckets = new Node[capacity];
        this.size = 0;
    }

    //method to find the index for a key
    private int getBucketIndex(String key) {
        int hashCode = key.hashCode();
        //use Math.abs because hashCode can be negative
        return Math.abs(hashCode) % capacity;
    }

    //Insert or Update
    public void put(String key, int value) {
        int index = getBucketIndex(key);
        Node head = buckets[index];

        //Search if key already exists to update it
        Node current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value; // Update existing value
                return;
            }
            current = current.next;
        }

        //key not found, insert new node at the beginning (Head)
        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;
    }

    //Retrieve value returns -1 if key is not found 
    public int get(String key) {
        int index = getBucketIndex(key);
        Node current = buckets[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return -1; // Key not found
    }

    //delete a key
    public void remove(String key) {
        int index = getBucketIndex(key);
        Node current = buckets[index];
        Node prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                //found it. now unlink it.
                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    //testing the Map
    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap(10);

        System.out.println("Adding Ravi (Age 21)...");
        map.put("Ravi", 21);
        
        System.out.println("Adding Sahil (Age 30)...");
        map.put("Sahil", 30);

        System.out.println("Get Ravi: " + map.get("Ravi"));

        System.out.println("Updating Ravi to 26...");
        map.put("Ravi", 26);
        System.out.println("Get Ravi: " + map.get("Alice"));

        System.out.println("Removing Sahil...");
        map.remove("Sahil");
        System.out.println("Get Sahil: " + map.get("Bob")); // Returns -1
    }
}
