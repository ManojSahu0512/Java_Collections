package Java8Features.DateAndTimeAPI.LocalDateTime;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        DateTimeFormatter myFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String format=localDate.format(myFormatter);
        System.out.println(format);


        //
        String date="25/04/1998";
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parse=LocalDate.parse(date,dateTimeFormatter);


        String dateTimeString="2023-04-24 10:30:45+05:30";
        DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssXXX");
        ZonedDateTime zonedDateTime=ZonedDateTime.parse(dateTimeString,formatter1);
        System.out.println(zonedDateTime);
    }
}
