package CoreJava.Java8Features.References.MethodReferences;

import java.util.Arrays;
import java.util.List;

class Utils {
    public static void greet(String name) {
        System.out.println("Hello, " + name);
    }
}

public class StaticMethodExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using method reference to a static method
        names.forEach(Utils::greet);
    }
}
