package CoreJava.Java8Features.StreamAPI.Map;

import java.util.Arrays;
import java.util.List;

public class ConvertListOfStringsToUppercase {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("vipul", "arnav", "raj");
        List<String>namesInUpperCase=names.stream().map(s->s.toUpperCase()).toList();
        System.out.println(namesInUpperCase);//[VIPUL, ARNAV, RAJ]

    }
}
