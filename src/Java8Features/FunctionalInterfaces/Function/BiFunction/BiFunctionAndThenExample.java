package Java8Features.FunctionalInterfaces.Function.BiFunction;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionAndThenExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        Function<Integer, String> resultToString = r -> "Result is: " + r;

        String finalResult = multiply.andThen(resultToString).apply(4, 5);
        System.out.println(finalResult); // Output: Result is: 20
    }
}
