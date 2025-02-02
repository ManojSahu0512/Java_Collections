package OOPs.Interface;
// Defining an interface
interface Vehicle {
    void start(); // Abstract method
    void stop();
}

// Implementing the interface
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Vehicle myCar = new Car(); // Upcasting
        myCar.start();
        myCar.stop();
    }
}


//Car is starting...
//Car is stopping...