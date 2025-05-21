package LLD.BehavioralPatterns.StrategyDesignPattern.OldDesign;

public class OffRoadVehicle extends Vehicle{
    //OffRoad and Sports need same code, but it is not available in parent class(Vehicle) duplicate code issue
    public void drive(){
        System.out.println("Sports vehicle capability");
    }

}
