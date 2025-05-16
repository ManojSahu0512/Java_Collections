package ShrayansJain.Exception.RuntimeExceptionOrUncheckedException.ArithemeticException;

public class RunTimeExample {
    public static void method1(){
        throw new ArithmeticException();
    }
    public static void main(String[] args) {
        method1();

    }
}
//Exception in thread "main" java.lang.ArithmeticException
//	at ShrayansJain.Exception.RuntimeExceptionOrUncheckedException.RunTimeExample.method1(RunTimeExample.java:5)