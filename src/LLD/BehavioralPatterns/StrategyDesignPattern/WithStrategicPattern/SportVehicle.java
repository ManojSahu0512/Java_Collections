package LLD.BehavioralPatterns.StrategyDesignPattern.WithStrategicPattern;

public class SportVehicle extends Vehicle{
    SportVehicle() {
        super(new SportDriveStrategy());
    }
}
