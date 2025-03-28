package Coding.Arrays;

public class Sort012S {
    public static int[] sorted(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;

    }

    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        nums=sorted(nums);
        for(int num:nums){
            System.out.println(num);
        }

    }
}
