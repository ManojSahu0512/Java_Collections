package CoreJava.Java8Features.DateAndTimeAPI.Duration;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {
    public static void main(String[] args) throws InterruptedException {
        Instant start=Instant.now();
        int sum=0;
        for(int i=0;i<100000;i++){
            sum+=i;
        }
        Instant end=Instant.now();
        Duration d1=Duration.between(start,end);
        Duration d2=Duration.of(1, ChronoUnit.MILLIS);
        System.out.println(d1);
        System.out.println(d2);
        int i=d1.compareTo(d2);
        System.out.println(i);//negative value

        LocalDateTime a=LocalDateTime.now();
        Thread.sleep(2000);
        LocalDateTime b=LocalDateTime.now();
        Duration duration1=Duration.between(a,b);
        System.out.println(duration1);//PT2.006428S


    }
}
