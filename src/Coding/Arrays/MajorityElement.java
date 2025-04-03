package Coding.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int findMajorityElement(int[] arr){
        Map<Integer,Integer>frequencyMap=new HashMap<>();
        int n = arr.length;

        //Use getOrDefault(key, defaultValue) to get the current count or 0 if the key does not exist.
        //getOrDefault(key, defaultValue)
        for(int num:arr){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
            if(frequencyMap.get(num)>n/2){
                return num;
            }
        }
        return -1;




    }
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 3, 3, 3, 1};
        System.out.println(findMajorityElement(arr)); // Output: 3



    }
}
