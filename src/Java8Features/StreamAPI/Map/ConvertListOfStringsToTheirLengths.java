package Java8Features.StreamAPI.Map;

import java.util.Arrays;
import java.util.List;

public class ConvertListOfStringsToTheirLengths {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Ram","Shyam","Sohan");
        List<Integer>length1=names.stream().map(s->s.length()).toList();
        System.out.println(length1);//[3, 5, 5]
        //Method-2
        List<Integer>length2=names.stream().map(String::length).toList();

    }
}
