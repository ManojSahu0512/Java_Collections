package Java8Features.References.MethodReferences;

import java.util.Arrays;
import java.util.List;

class Printer {
    public void printUpper(String str) {
        System.out.println(str.toUpperCase());
    }
}
public class NonStaticMethodReferenceOrCreatingObjectAndCall {
    public static void main(String[] args) {
        Printer printer = new Printer();
        List<String> words = Arrays.asList("java", "method", "reference");

        // Using instance method reference of a specific object
        words.forEach(printer::printUpper);
    }
}
