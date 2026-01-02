package com.inheritance.leveltwo;

//Online course class subclass of Course class
public class OnlineCourse extends Course {

    //online course attributes
    protected String platform;
    protected boolean isRecorded;

    //parameterized constructor
    public OnlineCourse(String courseName, int duration,String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    //overridden method to display course details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform    : " + platform);
        System.out.println("Recorded    : " + (isRecorded ? "Yes" : "No"));
    }
}

