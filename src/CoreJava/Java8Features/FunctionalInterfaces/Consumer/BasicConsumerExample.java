package CoreJava.Java8Features.FunctionalInterfaces.Consumer;

import java.util.function.Consumer;

public class BasicConsumerExample {
    public static void main(String[] args) {
        Consumer<String> greeter = s -> System.out.println("Hello " + s);
        greeter.accept("Manoj");
    }
}
//Hello Manoj
