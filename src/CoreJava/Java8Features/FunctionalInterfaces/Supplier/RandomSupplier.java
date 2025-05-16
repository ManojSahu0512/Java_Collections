package CoreJava.Java8Features.FunctionalInterfaces.Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class RandomSupplier {
    public static void main(String[] args) {
        Supplier<Integer>randomNumGenerate=()->new Random().nextInt(100);//0 to 99
        System.out.println(randomNumGenerate.get());
        System.out.println(randomNumGenerate.get());
    }
}
