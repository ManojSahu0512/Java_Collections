package Java8Features.OptionalClass;

import java.util.Optional;

public class ChainingwithOptional {
    public static void main(String[] args) {
        String str = "hello";
        String result = Optional.ofNullable(str)
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("H"))
                .orElse("Default");
        System.out.println(result); // HELLO

    }
}
