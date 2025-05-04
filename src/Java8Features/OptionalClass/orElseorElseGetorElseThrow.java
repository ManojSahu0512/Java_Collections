package Java8Features.OptionalClass;

import java.util.Optional;

public class orElseorElseGetorElseThrow {
    public static void main(String[] args) {
        Optional<String> name = Optional.empty();

        System.out.println(name.orElse("Default")); // Default

        System.out.println(name.orElseGet(() -> "Generated")); // Generated

// name.orElseThrow(() -> new RuntimeException("Name not found"));

    }
}
