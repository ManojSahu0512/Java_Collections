package CoreJava.String;
//Note: CoreJava.String objects are stored in a special memory area known as the "string constant pool".

public class BasicsExample {
    public static void main(String[] args) {
        char[] ch={'a','g','a','r'};
        String str=new String(ch);
        //OR both are same
        String str1="agar";

        //Direct assignment using string literals:
        String s1="Welcome";
        String s2="Welcome";//It doesn't create a new instance

        //Using the CoreJava.String constructor:
        String s=new String("Welcome");//creates two objects and one reference variable

        String str2 = new String("Hello, World!");

        //StringBuffer
        //CoreJava.String Buffer represents a mutable sequence of characters
        // that ensures thread safety, making it suitable for scenarios
        // involving multiple threads that modify a character sequence.
        // It includes various string manipulation capabilities, including the ability
        // to insert, delete, and append characters. This design avoids the necessity of
        // generating new objects with each change, leading to enhanced efficiency in situations
        // requiring regular adjustments to the string content.



        StringBuffer stringBuffer=new StringBuffer("Hello");
        //// Appending to the StringBuffer
        stringBuffer.append("word!!");

        //// Inserting into the StringBuffer
        stringBuffer.insert(5,"Java");

        // Deleting from the StringBuffer
        stringBuffer.delete(5, 10);
        System.out.println(stringBuffer); // Output: Hello, World!

        //StringBuilder shares similarities with StringBuffer by being a mutable character sequence. The crucial distinction lies in StringBuilder not being synchronized, rendering it not suitable for thread-safe operations. This absence of synchronization, though, contributes to StringBuilder offering superior performance in environments that are single-threaded or confined to a specific thread. As a result, StringBuilder becomes the favored option for manipulating strings in contexts where the safety of concurrent thread access is not an issue.
        // Creating a StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        // Appending to the StringBuilder
        sb.append(", World!");
        // Inserting into the StringBuilder
        sb.insert(5, " Java");
        // Deleting from the StringBuilder
        sb.delete(5, 10);
        System.out.println(sb); // Output: Hello, World!




    }
}
