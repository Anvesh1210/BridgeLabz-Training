package com.sorting.eduresults;

//class to represent Edu Result
public class EduResults {

	// method for starting merge sort
	public void mergeSort(Student[] students) {
		if (students.length < 2) {
			return;
		}
		int mid = students.length / 2;
		Student[] left = new Student[mid];
		Student[] right = new Student[students.length - mid];
		for (int i = 0; i < mid; i++) {
			left[i] = students[i];
		}
		for (int i = mid; i < students.length; i++) {
			right[i - mid] = students[i];
		}
		mergeSort(left);
		mergeSort(right);
		merge(students, left, right);
	}

	// method for merging two sorted student lists (stable sort)
	private void merge(Student[] result, Student[] left, Student[] right) {
		int i = 0, j = 0, k = 0;

		while (i < left.length && j < right.length) {
			if (left[i].getScore() >= right[j].getScore()) {
				result[k++] = left[i++];
			} else {
				result[k++] = right[j++];
			}
		}

		while (i < left.length) {
			result[k++] = left[i++];
		}
		while (j < right.length) {
			result[k++] = right[j++];
		}
	}

	// method for displaying rank list
	public void displayResults(Student[] students) {
		for (Student s : students) {
			s.display();
		}
	}
}
