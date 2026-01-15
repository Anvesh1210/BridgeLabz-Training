package com.callcenter;

public class Customer implements Comparable<Customer> {

    private String customerId;
    private String name;
    private boolean isVIP;

    public Customer(String customerId, String name, boolean isVIP) {
        this.customerId = customerId;
        this.name = name;
        this.isVIP = isVIP;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public boolean isVIP() {
        return isVIP;
    }

    @Override
    public int compareTo(Customer other) {
        // VIP customers get higher priority
        return Boolean.compare(other.isVIP, this.isVIP);
    }

    public void display() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("VIP: " + (isVIP ? "Yes" : "No"));
    }
}

