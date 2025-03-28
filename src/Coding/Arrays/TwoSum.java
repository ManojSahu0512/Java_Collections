package Coding.Arrays;

import javax.imageio.stream.ImageInputStream;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSumBrute(int[] nums, int target){
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;

    }
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int numMoreNeeded = target - num;
            if (hashmap.containsKey(numMoreNeeded)) {
                ans[0] = hashmap.get(numMoreNeeded);
                ans[1] = i;
            }
            hashmap.put(nums[i], i);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};

        int target = 9;
        //Because nums[0] + nums[1] == 9, we return [0, 1].
        int[] result=new int[2];
        result=twoSum(nums,target);
        for(int num:result){
            System.out.println(num);

        }

        int[] nums2 = {2,7,11,15};

        int target2 = 9;
        int[] result2=new int[2];
        result2=twoSumBrute(nums,target);
        for(int num2:result2){
            System.out.println(num2);

        }


    }
}
//0,1
//0,1