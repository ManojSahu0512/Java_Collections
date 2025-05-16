package CoreJava.Java8Features.StreamAPI.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleConditions {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 15, 20, 25, 30);
        List<Integer> filtered = nums.stream()
                .filter(n -> n > 15)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(filtered); // [20, 30]
    }
}
