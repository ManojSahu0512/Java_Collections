package Java8Features.FunctionalInterfaces.Function;

import java.util.function.Function;

public class FunctionAndThenExamp {
    public static void main(String[] args) {
        Function<Integer,Integer> function1=x->2*x;
        Function<Integer,Integer> function2=x->x*x*x;
        System.out.println(function1.andThen(function2).apply(3));//216
        System.out.println(function2.andThen(function1).apply(3));//54
        //both are same
        System.out.println(function1.compose(function2).apply(3));//54
    }
}
