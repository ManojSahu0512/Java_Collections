package Java8Features.DateAndTimeAPI.LocalTime;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime now=LocalTime.now();
        System.out.println(now);
        LocalTime customTime=LocalTime.of(14,30,22);
        System.out.println(customTime);
        LocalTime parsedTime=LocalTime.parse("15:30:33");
        System.out.println(parsedTime);
        LocalTime BeforeOneHour=now.minusHours(1);
        System.out.println(BeforeOneHour);
        if(now.isAfter(BeforeOneHour)){
            System.out.println("Ha bhai");
        }

    }

}
