package com.inheritance.leveltwo;

public class PersonDriver {
	 public static void main(String[] args) {
		 // Creating objects using Person reference
         Person p1 = new Teacher("Mr. Sharma", 40, "Mathematics");
         Person p2 = new Student("Anvesh", 20, "B.Tech");
         Person p3 = new Staff("Ramesh", 35, "Administration");
         
         //displaying details
         System.out.println("---- School Members ----\n");
         p1.displayDetails();
         p1.displayRole();
         System.out.println();
         p2.displayDetails();
         p2.displayRole();
         System.out.println();
         p3.displayDetails();
         p3.displayRole();
    }
}
