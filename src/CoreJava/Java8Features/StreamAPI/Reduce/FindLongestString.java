package CoreJava.Java8Features.StreamAPI.Reduce;

import java.util.Arrays;
import java.util.List;

public class FindLongestString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "Reduce", "Example");
        String longest=words.stream().reduce((s1,s2)->s1.length()>s2.length()?s1:s2).orElse("");
        System.out.println(longest);//Example

    }
}
