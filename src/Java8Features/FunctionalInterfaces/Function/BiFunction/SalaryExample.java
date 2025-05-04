package Java8Features.FunctionalInterfaces.Function.BiFunction;
import java.util.function.BiFunction;

public class SalaryExample {
    public static void main(String[] args) {
        BiFunction<Integer, Double, Double> calculateBonus = (salary, bonusPercent) -> salary + (salary * bonusPercent);
        System.out.println(calculateBonus.apply(50000, 0.10)); // Output: 55000.0
    }
}
