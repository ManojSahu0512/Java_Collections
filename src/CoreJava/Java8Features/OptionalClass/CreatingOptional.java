package CoreJava.Java8Features.OptionalClass;

import java.util.Optional;

public class CreatingOptional {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Vipul");        // Non-null value
        Optional<String> empty = Optional.empty();           // Empty Optional
        Optional<String> maybeName = Optional.ofNullable(null); // Accepts null


    }
}
