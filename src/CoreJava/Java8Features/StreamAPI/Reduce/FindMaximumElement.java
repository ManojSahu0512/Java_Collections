package CoreJava.Java8Features.StreamAPI.Reduce;

import java.util.Arrays;
import java.util.List;

public class FindMaximumElement {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 7, 1, 9, 3);
        int maxValue=nums.stream().reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
        System.out.println(maxValue);//9

    }
}
