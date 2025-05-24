package ShrayansJain.Exception.CustomException;

public class Main {
    public static void main(String[] args) {
        //here I am handling that's why I am not writing MyCustomException
        try {
            method3();
        }catch (MyCustomException e){

        }
    }
    public static void method3() throws MyCustomException {
        //if you not writing MyCustomException you need to handle it inside
        throw new MyCustomException("Some of issue arise");
    }
}
