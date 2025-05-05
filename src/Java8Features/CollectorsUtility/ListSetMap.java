package Java8Features.CollectorsUtility;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ListSetMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

// List
        List<String> list = names.stream().collect(Collectors.toList());

// Set
        Set<String> set = names.stream().collect(Collectors.toSet());

// Map
        Map<Integer, String> map = names.stream()
                .collect(Collectors.toMap(String::length, name -> name, (v1, v2) -> v1)); // handles duplicates

    }
}
