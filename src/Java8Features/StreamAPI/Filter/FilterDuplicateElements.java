package Java8Features.StreamAPI.Filter;

import java.util.Arrays;
import java.util.List;

public class FilterDuplicateElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer>unique=numbers.stream().distinct().toList();
        System.out.println(unique);//[1, 2, 3, 4, 5]

    }
}
