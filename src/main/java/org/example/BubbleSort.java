package org.example;

public class BubbleSort {

    // Public method to sort an array using bubble sort
    public static void bubbleSort(int[] arr) {
        if (arr == null) throw new IllegalArgumentException("Array must not be null");
        bubbleSortInternal(arr);
    }

    // Private method containing the bubble sort logic
    private static void bubbleSortInternal(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}