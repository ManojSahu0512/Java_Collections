package LLD.BehavioralPatterns.StrategyDesignPattern.WithStrategicPattern;

public class SportDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sport drive capability");
    }
}
