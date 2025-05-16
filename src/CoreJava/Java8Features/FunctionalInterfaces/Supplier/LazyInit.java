package CoreJava.Java8Features.FunctionalInterfaces.Supplier;
import java.util.function.Supplier;

public class LazyInit {
    public static void main(String[] args) {
        Supplier<Double> expensiveValue = () -> {
            System.out.println("Calculating...");
            return Math.pow(5, 10);
        };

        System.out.println("Before get");
        Double value = expensiveValue.get(); // Triggers calculation
        System.out.println("Value: " + value);
    }
}
