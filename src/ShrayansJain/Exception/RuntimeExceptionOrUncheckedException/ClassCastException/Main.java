package ShrayansJain.Exception.RuntimeExceptionOrUncheckedException.ClassCastException;

public class Main {
    public static void main(String[] args) {
        Object val=0;
        System.out.println((String)val);
    }
}
//Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.CoreJava.String (java.lang.Integer and java.lang.CoreJava.String are in module java.base of loader 'bootstrap')
//	at ShrayansJain.Exception.RuntimeExceptionOrUncheckedException.ClassCastException.Main.main(Main.java:6)