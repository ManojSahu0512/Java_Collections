package Java8Features.FunctionalInterfaces.Supplier;

import java.util.function.Supplier;

public class BasicSupplier {
    public static void main(String[] args) {
        Supplier<String> messageSupplier=()->"Hello from supplier!";
        System.out.println(messageSupplier.get());

    }
}
