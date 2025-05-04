package Java8Features.OptionalClass;

import java.util.Optional;

public class MapWithOptional {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Java");

        Optional<String> upper = name.map(String::toUpperCase);

        System.out.println(upper.get()); // JAVA


    }
}
