package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentLinkedList {
	 private StudentNode head; // first node

	    //method to add student at beginning
	    public void addAtBeginning(int rollNo, String name, int age, char grade) {
	        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
	        newNode.next = head;
	        head = newNode;
	    }

	    //method to add student at end
	    public void addAtEnd(int rollNo, String name, int age, char grade) {
	        StudentNode newNode = new StudentNode(rollNo, name, age, grade);

	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        StudentNode temp = head;
	        while (temp.next != null)
	            temp = temp.next;

	        temp.next = newNode;
	    }

	    //method to add student at given position (1-based)
	    public void addAtPosition(int pos, int rollNo, String name, int age, char grade) {

	        if (pos <= 0) return;

	        if (pos == 1) {
	            addAtBeginning(rollNo, name, age, grade);
	            return;
	        }

	        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
	        StudentNode temp = head;

	        for (int i = 1; i < pos - 1 && temp != null; i++)
	            temp = temp.next;

	        if (temp == null) return;

	        newNode.next = temp.next;
	        temp.next = newNode;
	    }

	    //method to delete student by roll number
	    public void deleteByRollNo(int rollNo) {

	        if (head == null) return;

	        if (head.rollNo == rollNo) {
	            head = head.next;
	            return;
	        }

	        StudentNode temp = head;
	        while (temp.next != null && temp.next.rollNo != rollNo)
	            temp = temp.next;

	        if (temp.next != null)
	            temp.next = temp.next.next;
	    }

	    //method to search student by roll number
	    public void searchByRollNo(int rollNo) {
	        StudentNode temp = head;

	        while (temp != null) {
	            if (temp.rollNo == rollNo) {
	                displayStudent(temp);
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Student not found");
	    }

	    //method to update grade by roll number
	    public void updateGrade(int rollNo, char grade) {
	        StudentNode temp = head;

	        while (temp != null) {
	            if (temp.rollNo == rollNo) {
	                temp.grade = grade;
	                return;
	            }
	            temp = temp.next;
	        }
	    }

	    //method to display all students
	    public void displayAll() {
	        StudentNode temp = head;
	        while (temp != null) {
	            displayStudent(temp);
	            temp = temp.next;
	        }
	    }

	    //method to display single student
	    private void displayStudent(StudentNode s) {
	        System.out.println(
	            "Roll: " + s.rollNo +
	            ", Name: " + s.name +
	            ", Age: " + s.age +
	            ", Grade: " + s.grade
	        );
	    }
}
