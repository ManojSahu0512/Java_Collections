package String.Date;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
public class StringToDate2 {
    // Method utilized for generating a random date string
    public static String generateRandomDateString() {
        Random random = new Random();
        int d = random.nextInt(28) + 1; // Random d between 1 and 28
        int m = random.nextInt(12) + 1; // Random m between 1 and 12
        int y = random.nextInt(100) + 1900; // Random y between 1900 and 1999
        return String.format("%02d/%02d/%04d", d, m, y); // Format the date string
    }
    // Method utilized for calculating age based on parsed date
    public static int calculateAge(Date birthDate) {
        Date cd = new Date();
        long dIMillis = Math.abs(cd.getTime() - birthDate.getTime());
        long Diff = dIMillis / (24 * 60 * 60 * 1000 * 365L);
        return (int) Diff;
    }
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 5; i++) { // Generate and process 5 random dates
                // Generate a random date string
                String randomDateStr = generateRandomDateString();
                // Print the generated random date string
                System.out.println("Random Date String: " + randomDateStr);
                // Creating an object of Date class with reference
                // to SimpleDateFormat class and
                // parsing the above string into it
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(randomDateStr);
                // Print and display the date corresponding
                // to the generated random date string
                System.out.println("Parsed Date: " + date);
                // Calculate and print age based on parsed date
                int age = calculateAge(date);
                System.out.println("Age: " + age + " years\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}