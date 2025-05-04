package Java8Features.FunctionalInterfaces.Predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterExample {
    public static void main(String[] args) {
        List<String > names= Arrays.asList("Vipul", "Arnav", "Vaibhav", "Ravi");
        Predicate<String> startWithV=name->name.startsWith("V");
        List<String> filtered=names.stream().filter(startWithV).toList();
        System.out.println(filtered);//[Vipul, Vaibhav]

    }
}
