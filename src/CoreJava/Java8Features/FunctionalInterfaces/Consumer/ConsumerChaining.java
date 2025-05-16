package CoreJava.Java8Features.FunctionalInterfaces.Consumer;

import java.util.function.Consumer;

public class ConsumerChaining {
    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println("First:" + s);
        Consumer<String> c2 = s -> System.out.println("Second:" + s.toUpperCase());

        Consumer<String> combined = c1.andThen(c2);

        combined.accept("lambda");
    }
}
