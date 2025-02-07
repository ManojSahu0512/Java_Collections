package Coding.Arrays;

public class BinarySearchOnSortedArray {
    public static boolean optimalSolution(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return true;
            } else if (arr[mid] < key) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }

        }
        return false;
    }

    public static int binarySearchRecursive(int[] arr, int low, int high, int target) {
        if (low > high) return -1; // Base case: element not found

        int mid = (low+high) / 2;

        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) return binarySearchRecursive(arr, mid + 1, high, target);
        else return binarySearchRecursive(arr, low, mid - 1, target);
    }


    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        boolean iskeyExist = optimalSolution(arr, 20);
        System.out.println(iskeyExist);

        int[] arr2 = {5, 10, 15, 20, 25, 30, 35, 40};
        int target = 25;

        int index = binarySearchRecursive(arr2, 0, arr.length - 1, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
