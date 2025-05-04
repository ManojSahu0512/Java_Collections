package Java8Features.StreamAPI;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Integer integer= Stream.iterate(0,x->x+1).limit(101).map(x->x/20).distinct().peek(System.out::println).max((a,b)->a-b).get();
        System.out.println(integer);//5
        long integer1= Stream.iterate(0,x->x+1).limit(101).map(x->x/20).distinct().count();
        System.out.println(integer1);//6


    }
}
