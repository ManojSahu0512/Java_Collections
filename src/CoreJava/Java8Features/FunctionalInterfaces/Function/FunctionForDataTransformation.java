package CoreJava.Java8Features.FunctionalInterfaces.Function;

import java.util.function.Function;

public class FunctionForDataTransformation {
    public static void main(String[] args) {
        Function<String, String> toUpper = str -> str.toUpperCase();
        Function<String, String> addGreeting = str -> "Hello, " + str;

        Function<String, String> greetUpper = toUpper.andThen(addGreeting);

        System.out.println(greetUpper.apply("vipul")); // Hello, VIPUL

    }
}
