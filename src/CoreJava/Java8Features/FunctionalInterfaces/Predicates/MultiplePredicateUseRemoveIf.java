package CoreJava.Java8Features.FunctionalInterfaces.Predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MultiplePredicateUseRemoveIf {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(Arrays.asList("Delhi", "Mumbai", "Chennai", "Bhopal"));

        Predicate<String> startsWithM = city -> city.startsWith("M");

        cities.removeIf(startsWithM);

        System.out.println(cities); // [Delhi, Chennai, Bhopal]

    }
}
