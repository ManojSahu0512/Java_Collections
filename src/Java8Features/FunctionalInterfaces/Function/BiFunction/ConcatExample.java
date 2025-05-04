package Java8Features.FunctionalInterfaces.Function.BiFunction;

import java.util.function.BiFunction;

public class ConcatExample {


    public static void main(String[] args) {
        BiFunction<String,String,String >concatenateString=(s1,s2)->s1+s2;
        System.out.println(concatenateString.apply("Hello","Word"));//HelloWord


    }
}
