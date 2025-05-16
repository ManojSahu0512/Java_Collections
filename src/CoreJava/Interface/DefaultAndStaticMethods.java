package CoreJava.Interface;

interface Camera{
    void capture();
    default void powerOn(){
        System.out.println("Camera is turning on...");
    }
    static void reset() {  // Static method
        System.out.println("Resetting camera settings.");
    }

}
class DSLR implements Camera {
    @Override
    public void capture() {
        System.out.println("DSLR is capturing a photo...");
    }
}
public class DefaultAndStaticMethods {
    public static void main(String[] args) {
        DSLR myCamera = new DSLR();
        myCamera.capture();
        myCamera.powerOn(); // Calls default method
        Camera.reset(); // Calls static method

    }
}

//DSLR is capturing a photo...
//Camera is turning on...
//Resetting camera settings.
