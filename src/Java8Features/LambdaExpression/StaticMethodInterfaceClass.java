package Java8Features.LambdaExpression;

interface A1{
    public static void sayHello(){
        System.out.println("Hello");
    }
}
public class StaticMethodInterfaceClass implements A1 {
    public static void main(String[] args) {
        StaticMethodInterfaceClass staticMethodInterfaceCall=new StaticMethodInterfaceClass();
        A1.sayHello();

    }
}
