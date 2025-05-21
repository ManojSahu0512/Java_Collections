package LLD.BehavioralPatterns.StrategyDesignPattern.WithStrategicPattern;

public class GoodVehicle extends Vehicle{
    GoodVehicle(){
        super(new NormalDriveStrategy());
    }

}
