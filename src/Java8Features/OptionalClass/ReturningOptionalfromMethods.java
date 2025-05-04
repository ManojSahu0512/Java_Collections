package Java8Features.OptionalClass;

import java.util.Optional;

public class ReturningOptionalfromMethods {
    public static Optional<String> getUserName(boolean found) {
        if(found)
            return Optional.of("Vipul");
        else
            return Optional.empty();
    }

    public static void main(String[] args) {
        String name = getUserName(false).orElse("Default User");
        System.out.println(name); // Default User

    }
}
