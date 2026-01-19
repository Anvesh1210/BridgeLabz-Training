package com.skillforgeapplication;
import java.util.*;

public class SkillForgeApp {
    //method for main execution
    public static void main(String[] args) {
        Instructor inst = new Instructor("Anvesh Sir");
        Course basic = inst.uploadCourse("Java Basics");
        Course advanced = new AdvancedCourse("Spring Boot Mastery", "Anvesh Sir");
        Student stu = new Student("Rahul");
        stu.updateProgress(3, 3);
        stu.setMarks(92);

        System.out.println("Grade: " + stu.calculateGrade());

        if (stu.isCompleted()) {
            System.out.println(basic.generateCertificate());
            System.out.println(advanced.generateCertificate());
        }
    }
}

