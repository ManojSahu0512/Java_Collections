package Java8Features.LambdaExpression.New.WithCollection;

import java.util.Arrays;
import java.util.List;

public class LambdaWithCollections {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Ram","Shyam","Rajan");
        names.forEach(name-> System.out.println(name));//uses a Consumer
    }
}
