package com.designprinciples.levelone;

//class to use university class
public class UniversityDriver {
	public static void main(String[] args) {

        //creating Faculty objects
        Faculty profRao = new Faculty("Prof. Rao");
        Faculty profMehta = new Faculty("Prof. Mehta");

        //creating University
        University university = new University("National Technical University");

        //Adding departments into University
        university.addDepartment("Computer Science");
        university.addDepartment("Mechanical Engineering");

        //adding faculty to the university
        university.addFaculty(profRao);
        university.addFaculty(profMehta);

        //displaying university details
        university.showUniversityDetails();

        //deleting university
        university.deleteUniversity();

        //showing details
        System.out.println("\nFaculty still exists independently:");
        System.out.println(profRao.getFacultyName());
        System.out.println(profMehta.getFacultyName());
    }
}
