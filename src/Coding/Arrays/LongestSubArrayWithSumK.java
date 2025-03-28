package Coding.Arrays;

import java.util.HashMap;

public class LongestSubArrayWithSumK {
    public static int longestSubArray(int[] arr, int k) {
        // code here
        int size=arr.length;
        int len=0;
        for(int i=0;i<size;i++){
            int sum=0;
            for(int j=i;j<size;j++){
                sum+=arr[j];
                if(sum==k){
                    len=Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
    public static int longestSubArrayOptimal(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            // ✅ If prefix sum is equal to k, update maxLength
            if (prefixSum == k) {
                maxLength = i + 1;
            }

            // ✅ If (prefixSum - k) exists in HashMap, update maxLength
            if (map.containsKey(prefixSum - k)) {
                maxLength = Math.max(maxLength, i - map.get(prefixSum - k));
            }

            // ✅ Store prefix sum in HashMap if it's not already present
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        int result=longestSubArray(arr,k);
        System.out.println(result);

        int[] arr2 = {10, 5, 2, 7, 1, 9};
        int k1 = 15;
        System.out.println(longestSubArrayOptimal(arr2, k1));
    }
}
