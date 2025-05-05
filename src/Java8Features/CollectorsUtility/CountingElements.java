package Java8Features.CollectorsUtility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountingElements {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4);
        long count = list.stream().collect(Collectors.counting());
        System.out.println(count); // 4

    }
}
