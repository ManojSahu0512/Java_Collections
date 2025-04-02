package Java8Features.DateTime;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate now= LocalDate.now();
        System.out.println(now);
        LocalDate customDate=LocalDate.of(1999,2,1);

        int dayOfMonth = now.getDayOfMonth();
        Month month = now.getMonth();
        int monthInNumber=now.getMonthValue();
        int year = now.getYear();
        System.out.println(dayOfMonth);
        System.out.println(month+" OR "+monthInNumber);
        System.out.println(year);

        LocalDate today=LocalDate.now();
        System.out.println(today);
        LocalDate yesterday=today.minusDays(1);
        System.out.println(yesterday);
        LocalDate pastDate=today.minusMonths(100);
        System.out.println(pastDate);

        if(today.isAfter(yesterday)){
            System.out.println("Ha bhai");
        }




    }
}
