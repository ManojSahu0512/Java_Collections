package Coding.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
Given an array of integers, find the longest subArray where the absolute difference between any two elements is less than or equal to 1.
 */
public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a){
        int[] freq=new int[101];
        for(Integer num:a){
            freq[num]++;
        }
        int max=0;
        for(int i=1;i<freq.length;i++){
            max=Math.max(max,freq[i]+freq[i-1]);
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> a= Arrays.asList(1,1,2,2,4,4,5,5,5);
        List<Integer> b=Arrays.asList(4,6, 5, 3, 3, 1);
        int result=pickingNumbers(a);
        System.out.println(result);
        int result2=pickingNumbers(b);
        System.out.println(result2);
    }
}
