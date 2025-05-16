package CoreJava.Java8Features.OptionalClass;

public class OptionalExample {
    //Before Java 8:
   /* CoreJava.String name = getName();
    if(name != null) {
        System.out.println(name.toUpperCase());
    }

    */
    //With Java 8:
    /*
    Optional<CoreJava.String> name = getName();
     name.ifPresent(n -> System.out.println(n.toUpperCase()));
     */
}
