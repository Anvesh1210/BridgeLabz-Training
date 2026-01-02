package com.inheritance.leveltwo;

public class Waiter extends Persen2 implements Worker {

    // Area assigned to the waiter
    private int tableCount;

    // Constructor to initialize waiter details
    public Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    // Defines waiter's duties
    @Override
    public void performDuties() {
        System.out.println("Duties : Serving customers at " + tableCount + " tables");
    }
}