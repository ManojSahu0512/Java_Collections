package CoreJava.Java8Features.FunctionalInterfaces.Predicates;

import java.util.function.Predicate;

public class BasicPredicate {
    public static void main(String[] args) {
        Predicate<Integer> isNumGreaterThan10=x->x>10;
        System.out.println(isNumGreaterThan10.test(20));//ture
        System.out.println(isNumGreaterThan10.test(5));//false
    }
}
