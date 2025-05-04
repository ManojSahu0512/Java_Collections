package Java8Features.References.MethodReferences;

import java.util.Arrays;
import java.util.List;
 class Test2{
    public void print(String s){
        System.out.println(s);
    }

}
public class Test {
    public static void print(String s){
        System.out.println(s);
    }


    public static void main(String[] args) {
        List<String> students= Arrays.asList("Alice","Bob","Charlie");
        students.forEach(x-> System.out.println(x));
        System.out.println("====after references used====");
        //we can write Test::print inside of lambda expression but some define method only I can use
        //:: method reference operator

        students.forEach(Test::print);
        Test2 test2=new Test2();
        students.forEach(test2::print);




    }
}
