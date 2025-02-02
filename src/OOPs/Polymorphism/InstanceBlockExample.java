package OOPs.Polymorphism;

class A{
    A(){
        System.out.println("parent class constructor invoked");
    }
}
class B2 extends A{
    B2(){
        super();
        System.out.println("child class constructor invoked");
    }

    {System.out.println("instance initializer block is invoked");}

}
    public class InstanceBlockExample {
        public static void main(String[] args) {
            B2 b=new B2();
        }
}
//parent class constructor invoked
//instance initializer block is invoked
//child class constructor invoked
