package ShrayansJain.Exception.RuntimeExceptionOrUncheckedException.IndexOutOfBoundException;

public class ArrayIndexOutOfBoundExceptionExample {
    public static void main(String[] args) {
        int[]  arr={1,2,3};
        System.out.println(arr[5]);
    }
}
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
//	at ShrayansJain.Exception.RuntimeExceptionOrUncheckedException.IndexOutOfBoundException.Main.main(Main.java:6)