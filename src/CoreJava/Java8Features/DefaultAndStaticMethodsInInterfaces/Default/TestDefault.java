package CoreJava.Java8Features.DefaultAndStaticMethodsInInterfaces.Default;
interface Vehicle{
    void start();
    default void fuelType(){
        System.out.println("Use petrol or diesel");
    }
}
class Car implements Vehicle{
    public void start(){
        System.out.println("Car is starting...");
    }
}

public class TestDefault {
    public static void main(String[] args) {
        Car car=new Car();
        car.start();//Output: Car is starting...
        car.fuelType();//Output: Uses Petrol or Diesel

    }
}
