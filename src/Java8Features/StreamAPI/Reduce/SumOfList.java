package Java8Features.StreamAPI.Reduce;

import java.util.Arrays;
import java.util.List;

public class SumOfList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        int sum=nums.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);//15

    }
}
