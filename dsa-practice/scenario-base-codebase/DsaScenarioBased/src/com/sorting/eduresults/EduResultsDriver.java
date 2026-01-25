package com.sorting.eduresults;

//class to use Edu Result
public class EduResultsDriver {
	public static void main(String[] args) {
		Student[] students = { new Student("Anvesh", 92), new Student("Riya", 88), new Student("Kunal", 95),
				new Student("Meera", 88), new Student("Soham", 90), new Student("Aditi", 95) };

		// creating Edu result object
		EduResults manager = new EduResults();
		System.out.println("Rank List Before Sorting:");
		manager.displayResults(students);
		manager.mergeSort(students);
		System.out.println("\nFinal Rank List (Sorted by Score):");
		manager.displayResults(students);
	}
}
