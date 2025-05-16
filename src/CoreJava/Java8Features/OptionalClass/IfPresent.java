package CoreJava.Java8Features.OptionalClass;

import java.util.Optional;

public class IfPresent {
    public static void main(String[] args) {
        //ifPresent() – Execute If Value Exists
        Optional<String> name = Optional.of("Java");
        name.ifPresent(n -> System.out.println(n.toLowerCase())); // java


    }
}
