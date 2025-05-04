package Java8Features.FunctionalInterfaces.Function.BiFunction;
import java.util.function.BiFunction;

public class CompareExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> compare = (a, b) ->
                a > b ? "First is greater" : (a < b ? "Second is greater" : "Both are equal");

        System.out.println(compare.apply(10, 20)); // Output: Second is greater
    }
}
