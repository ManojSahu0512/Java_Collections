package CoreJava.Java8Features.FunctionalInterfaces.Function;

import java.util.function.Function;

public class FunctionCompose {
    public static void main(String[] args) {
        Function<Integer, Integer> doubleIt = x -> x * 2;
        Function<Integer, Integer> cubeIt = x -> x * x * x;

        Function<Integer, Integer> pipeline = doubleIt.compose(cubeIt);

        System.out.println(pipeline.apply(2)); // (2^3) * 2 = 8 * 2 = 16

    }
}
