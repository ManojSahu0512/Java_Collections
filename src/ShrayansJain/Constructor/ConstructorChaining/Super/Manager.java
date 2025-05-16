package ShrayansJain.Constructor.ConstructorChaining.Super;

public class Manager extends Person{
    Manager(){
        //here java will add super(); be default but if parent class
        // have parameterized constructor then I have to provide parameter as well
        System.out.println("Inside manager constructor: No argument");
    }
}
