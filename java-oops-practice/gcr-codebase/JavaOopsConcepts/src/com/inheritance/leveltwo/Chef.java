package com.inheritance.leveltwo;

//Chef class extending Persen2 and implementing Worker
public class Chef extends Persen2 implements Worker {

    // Specialization of the chef
    private String specialization;

    // Constructor to initialize chef details
    public Chef(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    // Defines chef's duties
    @Override
    public void performDuties() {
        System.out.println("Duties : Preparing " + specialization + " dishes");
    }
}
