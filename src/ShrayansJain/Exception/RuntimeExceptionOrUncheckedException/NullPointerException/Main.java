package ShrayansJain.Exception.RuntimeExceptionOrUncheckedException.NullPointerException;

public class Main {
    public static void main(String[] args) {
        String val=null;
        System.out.println(val.charAt(0));//null.chatAt(0)
    }
}
//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "CoreJava.String.charAt(int)" because "val" is null
//	at ShrayansJain.Exception.RuntimeExceptionOrUncheckedException.NullPointerException.Main.main(Main.java:6)