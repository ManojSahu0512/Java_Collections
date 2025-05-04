package Java8Features.OptionalClass;

import java.util.Optional;

public class IsPresentAndGet {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Alice");

        if(name.isPresent()) {
            System.out.println(name.get()); // Alice
        }
//⚠️ get() is risky — only use when you're sure the value is present.
    }
}
