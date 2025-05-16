package ShrayansJain.Exception.ComplieTimeExceptionOrCheckedException.ClassNotFoundException;

public class HandlingExample {
    public static void main(String[] args) {

    }
    public static void method1(){
        try {
            throw new ClassNotFoundException();
        }catch (ClassNotFoundException exceptionObject){
            exceptionObject.printStackTrace();
        }
    }
}
