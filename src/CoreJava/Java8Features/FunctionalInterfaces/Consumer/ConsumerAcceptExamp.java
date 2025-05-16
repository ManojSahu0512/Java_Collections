package CoreJava.Java8Features.FunctionalInterfaces.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerAcceptExamp {
    public static void main(String[] args) {
        Consumer<String> consumer=s -> System.out.println(s);
        consumer.accept("Sana");//sana

        Consumer<List<Integer>> listConsumer=li->{
            for(Integer i:li){
                System.out.println(i+100);


            }
        };
        listConsumer.accept(Arrays.asList(1,2,3,4));

    }
}
//Sana
//101
//102
//103
//104
