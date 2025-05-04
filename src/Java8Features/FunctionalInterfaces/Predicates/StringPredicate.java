package Java8Features.FunctionalInterfaces.Predicates;

import java.util.function.Predicate;

public class StringPredicate {
    public static void main(String[] args) {
        Predicate<String> isEmptyString=s->s.isEmpty();
        System.out.println(isEmptyString.test(""));//true
        System.out.println(isEmptyString.test("Hello"));//false
    }
}
