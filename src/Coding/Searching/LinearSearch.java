package Coding.Searching;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        int [] arr ={10,3,4,5};
        int target=4;
        System.out.println(linearSearch(arr,target));
    }
}
