package com.sortingalgorithms;

public class HeapSort{
	//method to perform heap sort algo
    public static void heapSort(int[] salaries) {
        int n = salaries.length;
        //build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }
        //extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;
            heapify(salaries, i, 0);
        }
    }

    public static void heapify(int[] salaries, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        //check left child
        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }
        //check right child
        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }
        //swap and heapify
        if (largest != i) {
            int temp = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = temp;
            heapify(salaries, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] salaryDemands = {60000, 45000, 80000, 50000, 70000};
        //before sorting
        for (int salary : salaryDemands) {
            System.out.print(salary + " ");
        }
        heapSort(salaryDemands);
        System.out.println();
        //after sorting
        for (int salary : salaryDemands) {
            System.out.print(salary + " ");
        }
    }
}

