package CoreJava.Java8Features.CollectorsUtility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectAsList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

// Collect to List
        List<String> nameList = names.stream().collect(Collectors.toList());
        System.out.println(nameList);

    }
}
