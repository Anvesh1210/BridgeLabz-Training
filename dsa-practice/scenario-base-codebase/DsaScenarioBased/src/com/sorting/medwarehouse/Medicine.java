package com.sorting.medwarehouse;

//class to represent medicine
public class Medicine {
    //medicine attributes
    private String medicineName;
    private int expiryDays; //days remaining to expiry

    //constructor for initializing medicine details
    public Medicine(String medicineName, int expiryDays) {
        this.medicineName = medicineName;
        this.expiryDays = expiryDays;
    }

    //method for getting expiry days
    public int getExpiryDays() {
        return expiryDays;
    }
    
    //overriding toSTring method
    @Override
	public String toString() {
		return "medicineName=" + medicineName + ", expiryDays=" + expiryDays ;
	}

}
