package CoreJava.Java8Features.LambdaExpression;

interface A1{
    public static void sayHello(){
        System.out.println("Hello");
    }
}
public class StaticMethodInterface implements A1 {
    public static void main(String[] args) {
        StaticMethodInterface staticMethodInterfaceCall=new StaticMethodInterface();
        A1.sayHello();

    }
}
