package ShrayansJain.Class.AbstractClass;

public abstract class Car {
    int mileage;
    Car(int mileage){
        this.mileage=mileage;
    }
    public abstract void pressBreak();
    public abstract void pressClutch();
    public int getNumOfWheels(){
        return 4;
    }
}
