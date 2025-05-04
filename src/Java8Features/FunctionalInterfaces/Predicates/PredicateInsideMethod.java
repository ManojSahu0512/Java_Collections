package Java8Features.FunctionalInterfaces.Predicates;

import java.util.function.Predicate;

public class PredicateInsideMethod {
    public static boolean checkString(String input, Predicate<String> condition) {
        return condition.test(input);
    }
    public static void main(String[] args) {
        Predicate<String> isUpperCase = s -> s.equals(s.toUpperCase());
        System.out.println(checkString("JAVA", isUpperCase));  // true
        System.out.println(checkString("Java", isUpperCase));  // false
    }
}
