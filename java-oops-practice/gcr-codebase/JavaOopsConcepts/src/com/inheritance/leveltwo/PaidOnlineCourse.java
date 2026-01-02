package com.inheritance.leveltwo;

public class PaidOnlineCourse extends OnlineCourse {

    //Paid online course Attributes
    private double fee;
    private double discount;

    //parameterized constructor
    public PaidOnlineCourse(String courseName, int duration,String platform, boolean isRecorded,double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    //method to return final fee
    public double getFinalFee() {
        return fee - (fee * discount / 100);
    }

  //overridden method to display paid course details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Course Fee  : " + fee);
        System.out.println("Discount   : " + discount + "%");
        System.out.println("Final Fee  : " + getFinalFee());
    }
}
