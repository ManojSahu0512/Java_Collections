package Java8Features.OptionalClass;

import java.util.Optional;

public class FlatMapWithOptional {
    public static void main(String[] args) {
        //Useful when the mapping function itself returns an Optional.
        Optional<String> name = Optional.of("Vipul");

        Optional<Optional<String>> nested = name.map(n -> Optional.of("Hi " + n));
        System.out.println(nested); // Optional[Optional[Hi Vipul]]

        Optional<String> flat = name.flatMap(n -> Optional.of("Hi " + n));
        System.out.println(flat); // Optional[Hi Vipul]

    }
}
