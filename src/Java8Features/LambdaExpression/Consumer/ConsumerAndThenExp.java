package Java8Features.LambdaExpression.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerAndThenExp {
    public static void main(String[] args) {
        Consumer<List<Integer>> listConsumer1= li->{
            for(Integer i:li){
                System.out.println(i+100);


            }
        };
        Consumer<List<Integer>> listConsumer2= li->{
            for(Integer i:li){
                System.out.println(i);


            }
        };
        listConsumer2.andThen(listConsumer1).accept(Arrays.asList(1,2,3,4));

    }
}
