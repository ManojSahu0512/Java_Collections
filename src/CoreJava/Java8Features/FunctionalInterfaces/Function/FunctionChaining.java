package CoreJava.Java8Features.FunctionalInterfaces.Function;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<Integer, Integer> doubleIt = x -> x * 2;
        Function<Integer, Integer> cubeIt = x -> x * x * x;

        Function<Integer, Integer> pipeline = doubleIt.andThen(cubeIt);

        System.out.println(pipeline.apply(2)); // (2*2)^3 = 8^3 = 512

    }
}
