package Coding.Arrays;

public class CheckArraySorted {
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {

            } else {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        int[] arr = {30, 20, 10, 50, 7};
        int[] arr1 = {10, 20, 30, 50, 70};
        System.out.println("Is arr sorted:" + isSorted(arr));
        System.out.println("Is arr sorted:" + isSorted(arr1));
    }
//Is arr sorted:false
//Is arr sorted:true


}
