package Java8Features.LambdaExpression.NewLambda.WithParameter;

import java.util.Comparator;

public class WithParameterExample2 {
    public static void main(String[] args) {
        // Traditional Comparator
        Comparator<Integer> comp1=new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b-a;
            }
        };

        //Lambda Comparator
        Comparator<Integer> comp2=(a,b)->b-a;

    }
}
