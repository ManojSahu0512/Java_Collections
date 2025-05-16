package CoreJava.Java8Features.FunctionalInterfaces.Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class RandomListGenerator {
    public static void main(String[] args) {
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            list.add(randomSupplier.get());
        }

        System.out.println(list); // Random list of 5 integers
    }
}
