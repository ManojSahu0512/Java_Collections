package Java8Features.FunctionalInterfaces.Function;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListFunctionExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Spring", "Lambda");

        Function<String, Integer> nameLength = str -> str.length();

        List<Integer> lengths = names.stream()
                .map(nameLength)
                .collect(Collectors.toList());

        System.out.println(lengths); // [4, 6, 6]
    }
}
