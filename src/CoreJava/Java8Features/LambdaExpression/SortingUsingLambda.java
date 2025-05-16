package CoreJava.Java8Features.LambdaExpression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingUsingLambda {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        Collections.sort(arr);//ascending order

        Collections.sort(arr,(a,b)->b-a);//descending order
        System.out.println(arr.toString());

    }
}
