package ShrayansJain.Class.AbstractClass;

public abstract class LuxuryCar extends Car {

    LuxuryCar(int mileage) {
        super(mileage);
    }
    //adding more abstraction
    public abstract void pressDualBreakSystem();
    @Override
    public void pressBreak(){
        //implementation of it goes here
    }

}
