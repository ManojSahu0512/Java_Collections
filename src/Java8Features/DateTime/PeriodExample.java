package Java8Features.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {
        LocalDate now=LocalDate.now();
        LocalDate then= LocalDate.of(1990,2,2);
        Period period=Period.between(now,then);
        System.out.println(period);//P-35Y-2M
    }
}
