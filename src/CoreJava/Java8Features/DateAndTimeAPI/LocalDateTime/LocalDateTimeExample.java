package CoreJava.Java8Features.DateAndTimeAPI.LocalDateTime;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime now=LocalDateTime.now();
        System.out.println(now);
        LocalDateTime myDate=LocalDateTime.parse("2023-01-05T12:44");
        System.out.println(myDate);
    }
}
