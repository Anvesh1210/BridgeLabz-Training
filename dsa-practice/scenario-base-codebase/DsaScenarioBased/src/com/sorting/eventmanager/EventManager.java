package com.sorting.eventmanager;

// class to manage ticket 
public class EventManager {

    //quick Sort method
    public static void quickSort(Ticket[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            // sort left part
            quickSort(arr, low, pivotIndex - 1);
            // sort right part
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // partition method
    private static int partition(Ticket[] arr, int low, int high) {

        double pivot = arr[high].price; // choosing last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].price <= pivot) {
                i++;

                // swap
                Ticket temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot at correct position
        Ticket temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
