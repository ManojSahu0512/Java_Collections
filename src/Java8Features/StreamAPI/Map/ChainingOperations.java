package Java8Features.StreamAPI.Map;

import java.util.Arrays;
import java.util.List;

public class ChainingOperations {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "map");
        //method reference used here
        List<String> result=words.stream().map(String::toUpperCase).map(s->s+"!").toList();
        for(String str:result){
            System.out.println(str);
        }
        //JAVA!
        //STREAM!
        //MAP!


    }
}
