package CoreJava.OOPs.Abstraction;

abstract class Bike{
    abstract void run();
}


class Honda extends Bike{

    @Override
    void run() {
        System.out.println("Safely running...");
    }
}
public class ExampleOfAbstract {
    public static void main(String[] args) {
        Bike bike=new Honda();
        bike.run(); //Safely running...
    }
}
