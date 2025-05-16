package ShrayansJain.Exception.ComplieTimeExceptionOrCheckedException.ClassNotFoundException;

public class ExceptionHandlingInCallerSide {
    public static void main(String[] args) {
        try{
          method2();//it can throw exception so I am handling
        }catch (ClassNotFoundException classNotFoundException){
            classNotFoundException.printStackTrace();
        }
    }
    public static void method2() throws ClassNotFoundException {
        throw new ClassNotFoundException();//throwing error but not handling it
    }
}
