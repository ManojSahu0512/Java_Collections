package Java8Features.LambdaExpression;

interface Parent {
    default void sayHello() {
        System.out.println("Body is required here");
    }

}
class Child implements Parent{


}
public class MyClass{
    public static void main(String[] args){

        Parent p=new Child();
        p.sayHello();
        Child c=new Child();
        c.sayHello();

       // Parent p=new Parent();
    }
}
