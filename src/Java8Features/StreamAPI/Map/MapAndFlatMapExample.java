package Java8Features.StreamAPI.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMapExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b");
        //Map
        List<List<String>> result = list.stream().map(e -> Arrays.asList(e, e.toUpperCase())).collect(Collectors.toList());

        System.out.println(result);//[[a, A], [b, B]]

        //FaltMap
        List<String> flatResult = list.stream()
                .flatMap(e -> Arrays.asList(e, e.toUpperCase()).stream())
                .collect(Collectors.toList());

        System.out.println(flatResult);//[a, A, b, B]
    }
}
