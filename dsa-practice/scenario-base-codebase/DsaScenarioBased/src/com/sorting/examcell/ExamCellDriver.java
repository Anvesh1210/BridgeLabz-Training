package com.sorting.examcell;

public class ExamCellDriver {

    public static void main(String[] args) {

        //creating student array
        Student[] students = {
            new Student(101, "Anvesh", 92),
            new Student(102, "Rahul", 85),
            new Student(103, "Priya", 96),
            new Student(104, "Neha", 88),
            new Student(105, "Aman", 90)
        };

        //sorting students by score
        ExamCell.mergeSort(students, 0, students.length - 1);

        //printing rank list
        System.out.println("State-Level Rank List:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
