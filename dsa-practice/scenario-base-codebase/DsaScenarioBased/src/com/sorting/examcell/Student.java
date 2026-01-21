package com.sorting.examcell;

//class to represent a student
public class Student {

    //student attributes
    int rollNo;
    String name;
    int score;

    //constructor to initialize student
    public Student(int rollNo, String name, int score) {
        this.rollNo = rollNo;
        this.name = name;
        this.score = score;
    }

    //overridden toString method
    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", Score: " + score;
    }
}
