package Java8Features.DateAndTimeAPI;

import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        long currentTimeMillis=System.currentTimeMillis();//old
        System.out.println(currentTimeMillis);

        Instant now=Instant.now();
        System.out.println(now);

    }
}
