package CoreJava.Java8Features.StreamAPI.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterNonNullValues {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("apple", null, "banana", null, "cherry");
        List<String >nonNullWords=fruits.stream().filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(nonNullWords);//[apple, banana, cherry]

    }
}
