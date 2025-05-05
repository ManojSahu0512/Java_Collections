package Java8Features.CollectorsUtility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummingAndAveraging {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
        double avg = numbers.stream().collect(Collectors.averagingInt(Integer::intValue));

        System.out.println("Sum: " + sum); // Sum: 15
        System.out.println("Average: " + avg); // Average: 3.0


    }
}
