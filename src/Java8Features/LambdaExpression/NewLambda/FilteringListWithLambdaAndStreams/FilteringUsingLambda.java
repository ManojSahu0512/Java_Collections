package Java8Features.LambdaExpression.NewLambda.FilteringListWithLambdaAndStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringUsingLambda {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,2,3,4,5,6);

        List<Integer> evenNums=nums.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNums);
    }
}
