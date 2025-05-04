package Java8Features.OptionalClass;

public class OptionalExample {
    //Before Java 8:
   /* String name = getName();
    if(name != null) {
        System.out.println(name.toUpperCase());
    }

    */
    //With Java 8:
    /*
    Optional<String> name = getName();
     name.ifPresent(n -> System.out.println(n.toUpperCase()));
     */
}
