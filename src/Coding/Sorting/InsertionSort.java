package Coding.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Start from the second element (index 1)
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Current element to be inserted
            int j = i - 1; // Start comparing with previous element

            // Shift elements greater than key to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key in its correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5, 6]
    }
}