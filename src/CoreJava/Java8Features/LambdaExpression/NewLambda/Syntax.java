package CoreJava.Java8Features.LambdaExpression.NewLambda;

public class Syntax {
    public static void main(String[] args) {
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println("Running thread");
            }
        };
        Runnable r2=()-> System.out.println("Running thread");
    }
}
