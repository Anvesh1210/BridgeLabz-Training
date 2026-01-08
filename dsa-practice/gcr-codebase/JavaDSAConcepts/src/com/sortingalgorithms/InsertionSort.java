package com.sortingalgorithms;

public class InsertionSort{
	//method to perform insertion sort algo
    public static void insertionSort(int[] empIds) {
        int n = empIds.length;
        //loop from second element
        for (int i = 1; i < n; i++) {
            int key = empIds[i];
            int j = i - 1;
            //shift elements to right
            while (j >= 0 && empIds[j] > key) {
                empIds[j + 1] = empIds[j];
                j--;
            }
            //insert element at correct position
            empIds[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] employeeIds = {1045, 1002, 1090, 1011, 1025};
        // before sorting
        for (int id : employeeIds) {
            System.out.print(id + " ");
        }
        insertionSort(employeeIds);
        System.out.println();
        // after sorting
        for (int id : employeeIds) {
            System.out.print(id + " ");
        }
    }
}
