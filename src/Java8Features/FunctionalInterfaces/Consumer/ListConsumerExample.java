package Java8Features.FunctionalInterfaces.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListConsumerExample {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Alice", "Bob", "Charlie");
        Consumer<String> printName=s-> System.out.println("Name: "+s);
        names.forEach(printName);


    }
}
