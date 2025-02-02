package OOPs.Inheritance;

interface A{
    default void methodA(){
        System.out.println("Method A from interface A");
    }

        }
        interface B{
    default void methodB(){
        System.out.println("Method B from interface B");
    }
        }

        class MyClass implements A,B{
    public void myMethod(){
        System.out.println("MyMethod in myclass");
    }

        }


public class MultipleInterfaceUsingInterfce {
    public static void main(String[] args) {
        MyClass myClass=new MyClass();
        myClass.methodA();
        myClass.methodB();
        myClass.myMethod();
        //Method A from interface A
        //Method B from interface B
        //MyMethod in myclass


    }
}
