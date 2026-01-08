package com.sortingalgorithms;

public class QuickSort{
	//method to perform Quick sort algo
    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex=partition(prices, low, high);
            //sort left part
            quickSort(prices, low, pivotIndex - 1);
            //sort right part
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] prices, int low, int high) {
        int pivot = prices[high];
        int i = low - 1;
        //rearrange elements
        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }
        //place pivot at correct position
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] productPrices = {999, 499, 1299, 299, 799};
        //before sorting
        for (int price : productPrices) {
            System.out.print(price + " ");
        }
        quickSort(productPrices, 0, productPrices.length - 1);
        System.out.println();
        //after sorting
        for (int price : productPrices) {
            System.out.print(price + " ");
        }
    }
}

