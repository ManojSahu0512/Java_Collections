package Coding.Arrays;

import java.util.Arrays;

public class RightArrayRotation {

    public static int[] RightArrayRotation(int[] arr, int k) {
        int d = k % arr.length;
        int[] newArray = new int[arr.length - d];
        for (int i = 0; i < arr.length - d; i++) {
            newArray[i] = arr[i];

        }
        int j = 0;
        for (int i = arr.length - d; i < arr.length; i++) {
            arr[j] = arr[i];
            j++;

        }
        for (int i = 0; i < newArray.length; i++) {
            arr[j] = newArray[i];
            j++;

        }
        return arr;


    }
    /*
    Algorithm:
Reverse the entire array.
Reverse the first N elements.
Reverse the remaining size - N elements.
Time & Space Complexity Analysis:

Time Complexity: O(N) (Each element is swapped at most twice)
Space Complexity: O(1) (No extra space used)
     */
    // Fixed Optimal Solution
    public static int[] optimalSolution(int[] arr, int k) {
        int size = arr.length;
        k = k % size;

        if (k == 0) return arr;

        reverse(arr, 0, size - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, size - 1);

        return arr;
    }

    // Corrected Reverse Function
    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        //arr=RightArrayRotation(arr,2);
        for (int num : RightArrayRotation(arr, 8)) {
            System.out.print(num + " ");
        }
        System.out.println("**************************");
        //optimalSolution
        int[] arr2 = {100, 200, 300, 400, 500, 600};
        arr2 = optimalSolution(arr2, 2);
        System.out.println("OptimalSolution Output: " + Arrays.toString(arr2));


    }
}
