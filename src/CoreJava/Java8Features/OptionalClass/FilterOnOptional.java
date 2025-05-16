package CoreJava.Java8Features.OptionalClass;

import java.util.Optional;

public class FilterOnOptional {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Sana");

        Optional<String> result = name.filter(n -> n.startsWith("S"));

        System.out.println(result.isPresent()); // true

    }
}
