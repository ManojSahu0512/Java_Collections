package Coding.Arrays;

public class MoveZeroes {
    public static int[] moveZeroes(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
            }
        }
        for(int j=i;j<nums.length;j++){
            nums[j]=0;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums={0,1,0,1,0,0,50,12};
        nums=moveZeroes(nums);
        for (int num:nums){
            System.out.println(num+" ");

        }
    }


}
