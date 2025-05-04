package Java8Features.FunctionalInterfaces.Function.BiFunction;

import java.util.function.BiFunction;

public class AddExample {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> addNum=(a,b)->a+b;
        System.out.println(addNum.apply(10,20));
    }
}
