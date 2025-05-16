package CoreJava.Java8Features.FunctionalInterfaces.Supplier;

import java.util.function.Supplier;

public class SupplyDefaultValueIfNull {
    public static void main(String[] args) {
        String name = null;

        Supplier<String> defaultSupplier = () -> "Default Name";

        String result = (name != null) ? name : defaultSupplier.get();
        System.out.println(result); // Output: Default Name
    }
}
