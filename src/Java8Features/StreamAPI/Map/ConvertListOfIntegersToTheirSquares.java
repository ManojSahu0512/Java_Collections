package Java8Features.StreamAPI.Map;

import java.util.Arrays;
import java.util.List;

public class ConvertListOfIntegersToTheirSquares {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5);

        List<Integer> sqrNumbers=numbers.stream().map(x->x*x).toList();
        System.out.println(sqrNumbers);//[1, 4, 9, 16, 25]



    }
}
