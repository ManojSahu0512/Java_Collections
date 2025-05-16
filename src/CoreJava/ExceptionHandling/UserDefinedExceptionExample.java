package CoreJava.ExceptionHandling;
class UserDefinedException extends Exception{
    public  UserDefinedException(String str){
        // Calling constructor of parent Exception
        super(str);

    }
}

public class UserDefinedExceptionExample {
    public static void main(String[] args) {

        try{
            throw new UserDefinedException("This is user defind exception");
        }catch (UserDefinedException ude){
            System.out.println("caught is the exception");
            System.out.println(ude.getMessage());
        }


    }

}
