package LLD.CreationalPatterns.FactoryMethodDesignPattern;

public class MainClass {
    public static void main(String[] args) {
        SafeFactory safeFactoryObj=new SafeFactory();
        Shape shapeObj= safeFactoryObj.getShape("CIRCLE");//created circle object
        shapeObj.draw();
    }
}
