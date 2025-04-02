package Java8Features.DateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime indiaTime =ZonedDateTime.now();
        System.out.println(indiaTime);
        Set<String> availableZoneIds= ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(System.out::println);
        ZonedDateTime customZonedTime = ZonedDateTime.of(2000, 12, 1, 14, 30, 30, 30, ZoneId.of("America/Cuiaba"));
        System.out.println(customZonedTime);
        ZonedDateTime newYorkTime=ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(newYorkTime);

        ZonedDateTime zdtParse=ZonedDateTime.parse("2023-04-20T10:30:00-04:00[America/New_York]");
        System.out.println(zdtParse);



    }
}
