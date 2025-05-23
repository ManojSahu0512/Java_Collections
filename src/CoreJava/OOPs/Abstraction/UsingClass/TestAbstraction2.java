package CoreJava.OOPs.Abstraction;

abstract class Bike1{
    Bike1(){System.out.println("bike is created");}
    abstract void run();
    void changeGear(){System.out.println("gear changed");}
}
//Creating a Child class which inherits Abstract class
class Honda1 extends Bike1{
    void run(){System.out.println("running safely..");}
}

public class TestAbstraction2 {
    public static void main(String[] args) {
        Bike1 obj = new Honda1();
        obj.run();
        obj.changeGear();
    }
}
