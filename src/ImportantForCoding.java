import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ImportantForCoding {
    public static void main(String[] args) {

        String input = "a b c d";
        String noSpaces = input.replaceAll("\\s", ""); // removes all whitespace characters
        System.out.println(noSpaces);  // Output: "abcd"

        String input2 = "a b c d";
        String noSpaces1 = input.replace(" ", ""); // replaces only space character
        System.out.println(noSpaces);  // Output: "abcd"


        String input3 = "  hello world  ";
        String trimmed = input.trim();
        System.out.println(trimmed); // Output: "hello world"


        double value1 = 4.2;
        double result1 = Math.ceil(value1);
        System.out.println(result1);  // Output: 5.0

        double value2 = 4.9;
        double result2 = Math.floor(value2);
        System.out.println(result2);  // Output: 4.0

        StringBuilder result = new StringBuilder();

        //return result.toString();

        int cols=4;
        StringBuilder[] grid=new StringBuilder[cols];
        for(int i=0;i<cols;i++){
            grid[i]=new StringBuilder();

        }

        char ch = 'A';
        int ascii = (int) ch;  // Casting char to int

        int ascii2 = 65;
        char character = (char) ascii2; // Cast int to char
        System.out.println("Character for ASCII " + ascii2 + " is: " + character);


        String s="lfl";
        String reversed = new StringBuilder(s).reverse().toString();
        //
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("b");
        list1.add("c");

        List<String> list2 = new ArrayList<>();
        list2.add("b");
        list2.add("c");
        list2.add("d");

        list1.retainAll(list2);

        System.out.println(list1); // Output: [b, b, c]

        // Need to convert to set to count unique minerals
        Set<String> uniqueGemstones = new HashSet<>(list1);
        }
}
