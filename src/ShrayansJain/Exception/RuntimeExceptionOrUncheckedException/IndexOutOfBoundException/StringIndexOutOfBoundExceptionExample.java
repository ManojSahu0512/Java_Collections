package ShrayansJain.Exception.RuntimeExceptionOrUncheckedException.IndexOutOfBoundException;

public class StringIndexOutOfBoundExceptionExample {
    public static void main(String[] args) {
        String str="hello";
        System.out.println(str.charAt(9));
    }
}
//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: CoreJava.String index out of range: 9
//	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
//	at java.base/java.lang.CoreJava.String.charAt(CoreJava.String.java:1519)