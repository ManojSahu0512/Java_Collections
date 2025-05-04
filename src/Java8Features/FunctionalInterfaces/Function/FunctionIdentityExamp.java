package Java8Features.FunctionalInterfaces.Function;

import java.util.function.Function;

public class FunctionIdentityExamp {
    //input and output will be same;
    public static void main(String[] args) {
        Function<String,String> identityFunction=Function.identity();
        System.out.println(identityFunction.apply("vipul"));//vipul
    }
}
