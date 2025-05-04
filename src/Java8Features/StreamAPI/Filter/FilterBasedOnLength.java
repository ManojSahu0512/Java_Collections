package Java8Features.StreamAPI.Filter;

import java.util.Arrays;
import java.util.List;

public class FilterBasedOnLength {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Jerry", "Mike", "Jonathan");
        List<String>namesLengthGreaterthan4=names.stream().filter(s->s.length()>4).toList();
        System.out.println(namesLengthGreaterthan4);//[Jerry, Jonathan]

    }
}
