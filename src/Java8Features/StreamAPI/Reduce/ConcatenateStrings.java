package Java8Features.StreamAPI.Reduce;

import java.util.Arrays;
import java.util.List;

public class ConcatenateStrings {
    public static void main(String[] args) {
        List<String> letters = Arrays.asList("H", "e", "l", "l", "o");
        String word=letters.stream().reduce("",(a,b)->a+b);
        System.out.println(word);//Hello
    }
}
