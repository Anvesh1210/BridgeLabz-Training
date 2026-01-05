package com.linkedlist.singlylinkedlist.studentrecordmanagement;

//Student node class to represent student as a node
public class StudentNode {
	//student attributes
	int rollNo;
    String name;
    int age;
    char grade;
    StudentNode next;

    //constructor to initialize student node
    StudentNode(int rollNo, String name, int age, char grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
