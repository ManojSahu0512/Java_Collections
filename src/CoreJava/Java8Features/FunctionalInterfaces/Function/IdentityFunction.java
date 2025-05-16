package CoreJava.Java8Features.FunctionalInterfaces.Function;

import java.util.function.Function;

public class IdentityFunction {
    public static void main(String[] args) {
        Function<String, String> identityFunc = Function.identity();
        System.out.println(identityFunc.apply("Hello")); // Output: Hello

    }
}
