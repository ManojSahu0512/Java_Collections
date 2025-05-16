package CoreJava.ExceptionHandling;

public class ThrowUncheckedExceptionExample {
    public static void validate(int age){

        if(age<18){

            //throw Arithmetic exception if not eligible to vote
            throw new ArithmeticException("Person is not eligible for vote!");

        }
        else{
            System.out.println("Person is eligible for vote!!");
        }
    }
    public static void main(String[] args) {

        validate(17);




    }
}
