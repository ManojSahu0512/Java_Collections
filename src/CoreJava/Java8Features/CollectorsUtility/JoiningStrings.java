package CoreJava.Java8Features.CollectorsUtility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "is", "awesome");

        String joined = list.stream().collect(Collectors.joining(" "));
        System.out.println(joined); // Java is awesome

        //You can also specify a prefix and suffix:
        String result = list.stream().collect(Collectors.joining(", ", "[", "]"));
// Output: [Java, is, awesome]



    }
}
