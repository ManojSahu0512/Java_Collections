package Coding.Arrays;

public class MissingNaturalNumber {
    public static int missingNumber(int[] nums) {
        int n=nums.length+1;
        int sum=(n*(n+1))/2;
        int result=0;
        for(int num:nums){
            result+=num;

        }
        return sum-result;

    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 6,7};
       int res= missingNumber(a);
        System.out.println(res);

    }
}
