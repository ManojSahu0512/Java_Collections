package Java8Features.LambdaExpression;

/*
Lambda expressions were introduced in Java 8 to provide a concise and functional approach to writing anonymous functions. They allow you to express instances of single-method interfaces (functional interfaces) in a more readable way.

Syntax of Lambda Expression
(parameters) -> expression

(parameters) -> { statements }

 */
@FunctionalInterface
interface MyInterface{
    void show();
}
public class SyntaxExample {
    public static void main(String[] args) {
        MyInterface obj=()->{
            System.out.println("Hello lambda !!");
        };

        obj.show();
    }

}
//Hello lambda !!
