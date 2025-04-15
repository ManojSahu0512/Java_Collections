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


    }
}
