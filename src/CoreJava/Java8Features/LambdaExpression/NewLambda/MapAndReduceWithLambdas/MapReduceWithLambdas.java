package CoreJava.Java8Features.LambdaExpression.NewLambda.MapAndReduceWithLambdas;

import java.util.Arrays;
import java.util.List;

public class MapReduceWithLambdas {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("java", "lambda", "rocks");
        // Convert to uppercase

        List<String> upperCaseNames=words.stream()
                .map(s -> s.toUpperCase()).toList();
        System.out.println(upperCaseNames); // [JAVA, LAMBDA, EXAMPLE]


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

// Sum using reduce
        int sum = list.stream().reduce(0, (a, b) -> a + b);

        System.out.println("Sum = " + sum); // Sum = 15

    }
}
