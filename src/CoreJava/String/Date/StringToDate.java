package CoreJava.String.Date;
import java.time.Instant;
import java.time.format.DateTimeParseException;
public class StringToDate {
    // Method utilized for the conversion of CoreJava.String variable to Date format.
    public static Instant fetchDate(String s) {
        // Creation of an Instant object
        Instant TimeStamp = null;
        // Parsing through the string to Date
        TimeStamp = Instant.parse(s);
        // Returning the converted TimeStamp with Date format.
        return TimeStamp;
    }
    public static void main(String[] args) {
        // Input the string value
        String s = "2020-03-28T10:15:01Z";
        // Trying to block for checking for runtime exceptions
        try {
            // Fetching the Date from CoreJava.String by
            // Creation of an object of the Instant class
            Instant TimeStamp = fetchDate(s);
            // Displaying the successfully converted date
            System.out.println("Date Converted From CoreJava.String: " + TimeStamp);
        } catch (DateTimeParseException e) {
            // Throws DateTimeParseException
            // Only if the string cannot be parsed
            System.out.println("Exception occurred while parsing: " + e.getMessage());
        } catch (Exception e) {
            // Handles any other runtime exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}