package LLD.BehavioralPatterns.StrategyDesignPattern.WithStrategicPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=new SportVehicle();
        vehicle.drive();//Sport drive capability

        Vehicle vehicle1=new GoodVehicle();
        vehicle1.drive();//Normal drive capability
    }
}
