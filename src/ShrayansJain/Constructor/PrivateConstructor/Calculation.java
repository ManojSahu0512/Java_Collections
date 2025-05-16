package ShrayansJain.Constructor.PrivateConstructor;
//can not access directly using static method only I can access.
public class Calculation {
    String name;
    int id;
    private  Calculation(){

    }
    public static Calculation getInstance(){//this is method return type is Calculation it should be static so outside class can access with the help of . class name

        return new Calculation();
    }
}
