package CoreJava.Java8Features.FunctionalInterfaces.Predicates;

import java.util.function.Predicate;

public class NegatePredicate {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println(isEven.test(4));                    // true
        System.out.println(isEven.negate().test(4));           // false
        System.out.println(isEven.negate().test(5));           // true

    }
}
