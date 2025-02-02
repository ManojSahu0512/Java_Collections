package OOPs.Interface;

interface Engine{
    void engineType();

}
interface Fuel{
    void fuelType();
}
class Bike implements Engine,Fuel{
    @Override
    public void engineType(){
        System.out.println("Bike has a petrol engine.");

    }
    @Override
    public void fuelType(){
        System.out.println("Bike uses petrol.");

    }
}
public class MultipleInterfaceExample {
    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.engineType();
        myBike.fuelType();
    }

}

//Bike has a petrol engine.
//Bike uses petrol.
