package CoreJava.Java8Features.StreamAPI.Reduce;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamWithCombiner {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        int result=nums.parallelStream().reduce(0,(subTotal,element)->subTotal+element,//accumulator
                Integer::sum);//combiner
        System.out.println(result);//15
    }
}
