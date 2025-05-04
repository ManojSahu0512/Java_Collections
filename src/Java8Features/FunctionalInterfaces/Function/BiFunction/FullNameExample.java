package Java8Features.FunctionalInterfaces.Function.BiFunction;
import java.util.function.BiFunction;

public class FullNameExample {
    public static void main(String[] args) {
        BiFunction<String, String, String> fullName = (first, last) -> first + " " + last;
        System.out.println(fullName.apply("Vipul", "Sharma")); // Output: Vipul Sharma
    }
}
