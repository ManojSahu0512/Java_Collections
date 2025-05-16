package CoreJava.Java8Features.FunctionalInterfaces.Predicates;

import java.util.function.Predicate;

public class PredicateChaining {
    public static void main(String[] args) {

        Predicate<String> startsWithV = name -> name.startsWith("V");
        Predicate<String> lengthGreaterThan5 = name -> name.length() > 5;
        Predicate<String> combined = startsWithV.and(lengthGreaterThan5);
        System.out.println(combined.test("Vipul"));     // false
        System.out.println(combined.test("Vaibhav"));   // true


        Predicate<String> combined2=startsWithV.or(lengthGreaterThan5);
        System.out.println(combined2.test("Vipul"));//true

    }
}
