package LLD.BehavioralPatterns.StrategyDesignPattern.WithStrategicPattern;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle() {
        super(new SportDriveStrategy());
    }
}
