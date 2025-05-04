package Java8Features.FunctionalInterfaces.Supplier;

import java.time.LocalTime;
import java.util.function.Supplier;

public class GetCurrentTimeUsingSupplier {
    public static void main(String[] args) {
        Supplier<LocalTime> timeSupplier = () -> LocalTime.now();
        System.out.println("Current Time: " + timeSupplier.get());
    }
}
