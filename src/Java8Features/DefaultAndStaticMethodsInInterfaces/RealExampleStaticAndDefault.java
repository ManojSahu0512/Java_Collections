package Java8Features.DefaultAndStaticMethodsInInterfaces;
interface Logger{
    default void logInfo(String msg){
        System.out.println("INFO:"+msg);
    }
    static void logError(String msg){
        System.out.println("ERROR:"+msg);
    }
}
class AppLogger implements Logger{
    // Inherits logInfo method


}
public class RealExampleStaticAndDefault {
    public static void main(String[] args) {
        AppLogger logger=new AppLogger();
        logger.logInfo("Application Started");// Output: INFO: Application started
        Logger.logError("Null Pointer Exception");// Output: ERROR: Null pointer exception
    }

}
