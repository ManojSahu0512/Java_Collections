package Java8Features.StreamAPI.Reduce;

import java.util.Arrays;
import java.util.List;

public class ProductOfElements {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        int product=nums.stream().reduce(1,(a,b)->a*b);
        System.out.println(product);//24


    }
}
