package Coding.Sorting;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraySorting {
    public static int[] SortedArrays(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
    public static int[] ReverseSortedArray(int[] arr1){
        Arrays.sort(arr1);
        int low =0;
        int high= arr1.length-1;
        while (low<high){
            int temp=arr1[low];
            arr1[low]=arr1[high];
            arr1[high]=temp;
            low++;  // Increment low
            high--; // Decrement high
        }
        return arr1;
    }

    public static void main(String[] args) {
        //int[] arr = {5, 2, 9, 1, 6, 3}; // Use Integer[] instead of int[] for reverse order sorting
        int[] arr = {5, 2, 9, 1, 6, 3};

        System.out.println("Sorted Array:");
        int[] result = SortedArrays(arr);
        System.out.println(Arrays.toString(result));

        int[] arr1 = {5, 2, 9, 1, 6, 3};

        System.out.println("Reverse Sorted Array:");
        int[] result1 = ReverseSortedArray(arr1);
        System.out.println(Arrays.toString(result1));
        }


    }

