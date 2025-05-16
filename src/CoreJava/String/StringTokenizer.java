package CoreJava.String;

import java.util.StringJoiner;

public class StringTokenizer {
    public static void main(String[] args) {
        // Creating a StringJoiner with a comma (,) as the delimiter
        StringJoiner joiner = new StringJoiner(", ");
        // Adding strings to the StringJoiner
        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Cherry");
        // Converting the StringJoiner to a CoreJava.String
        String result = joiner.toString();
        // Output the result
        System.out.println(result);  // Output: Apple, Banana, Cherry
    }
}
