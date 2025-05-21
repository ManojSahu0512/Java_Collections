package LLD.BehavioralPatterns.StrategyDesignPattern.WithStrategicPattern;

public class Vehicle {
    DriveStrategy driveObject;// we are not doing this---> =new NormalDriveStrategy();
    //construction injection
    Vehicle(DriveStrategy driveObj){
        this.driveObject=driveObj;


    }
    public void drive(){
        driveObject.drive();
    }


}
