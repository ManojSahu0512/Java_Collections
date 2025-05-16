package CoreJava.Java8Features.LambdaExpression;

import Coding.Arrays.Sort012S;

interface A{
    default void sayHello(){
        System.out.println("A says hello");
    };
}
interface B{
    default void sayHello(){
        System.out.println("B says Hello");
    };
}
public class MyClassExample implements A,B {
    public static void main(String[] args) {
        MyClassExample myClassExample=new MyClassExample();
        myClassExample.sayHello();

    }
    @Override
    public void sayHello(){
        //System.out.println("My own implementations");
        B.super.sayHello();
        A.super.sayHello();
    }


}
