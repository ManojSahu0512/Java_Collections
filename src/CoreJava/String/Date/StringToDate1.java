package CoreJava.String.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class StringToDate1 {
    public static LocalDate fetchDateFromString(String s, DateTimeFormatter format) {
        LocalDate d = LocalDate.parse(s, format);
        // Returning the converted d at the end
        return d;
    }
    public static void main(String[] args) {
        String s = "26 September, 2002";
        // Getting the format by creating an object of DateTImeFormatter class
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM, yyyy");
        // Try block to check for exceptions
        try {
            // Getting the Date from CoreJava.String
            LocalDate d = fetchDateFromString(s, format);
            // Printing the converted d
            System.out.println(d);
        }
        // Block 1
        // Catch block to handle exceptions occurring
        // if the CoreJava.String pattern is invalid
        catch (IllegalArgumentException e) {
            // Display the exception
            System.out.println("Exception: " + e);
        }
        // Block 2
        // If the CoreJava.String was unable to be parsed
        catch (DateTimeParseException e) {
            // Display the exception
            System.out.println("Exception: " + e);
        }
    }
}