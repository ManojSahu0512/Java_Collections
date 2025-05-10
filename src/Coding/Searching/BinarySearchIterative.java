package Coding.Searching;

public class BinarySearchIterative {
    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right)/ 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr ={10,3,4,5};
        int target=4;
        System.out.println(binarySearchIterative(arr,target));
    }
}
