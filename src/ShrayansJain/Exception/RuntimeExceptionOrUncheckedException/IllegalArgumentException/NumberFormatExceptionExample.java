package ShrayansJain.Exception.RuntimeExceptionOrUncheckedException.IllegalArgumentException;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        int val=Integer.parseInt("abkc");//it accepts only number like "1122"

    }
}
//Exception in thread "main" java.lang.NumberFormatException: For input string: "abkc"
//	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)