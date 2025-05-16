package CoreJava.Java8Features.StreamAPI.Reduce;

import java.util.Arrays;
import java.util.List;

public class CountUsingReduce {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d");
        int count=list.stream().reduce(0,(total,str)->total+1,Integer::sum);
        System.out.println(count);
    }
}
