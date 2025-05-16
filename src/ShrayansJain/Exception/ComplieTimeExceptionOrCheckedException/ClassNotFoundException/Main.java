package ShrayansJain.Exception.ComplieTimeExceptionOrCheckedException.ClassNotFoundException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        method1();//throwing no exception handling
    }
    public static void method1() throws ClassNotFoundException {
        throw new ClassNotFoundException();//throwing no exception handling
    }
}
