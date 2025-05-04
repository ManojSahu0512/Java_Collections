package Java8Features.FunctionalInterfaces.Function;


import java.util.function.Function;

public class FunctionExample2 {
    public static void main(String[] args) {
        Function<String,Integer> stringLength=s->s.length();
        System.out.println(stringLength.apply("Sahu"));

        Function<Integer,Integer> square=s->s*s;
        System.out.println(square.apply(10));


    }

}
