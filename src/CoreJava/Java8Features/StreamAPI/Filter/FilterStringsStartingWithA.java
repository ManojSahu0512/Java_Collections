package CoreJava.Java8Features.StreamAPI.Filter;

import java.util.Arrays;
import java.util.List;

public class FilterStringsStartingWithA {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Ajay","Mohan","Raja");
        List<String >namesStartWithA=names.stream().filter(s->s.startsWith("A")).toList();
        System.out.println(namesStartWithA);//[Ajay]

    }
}
