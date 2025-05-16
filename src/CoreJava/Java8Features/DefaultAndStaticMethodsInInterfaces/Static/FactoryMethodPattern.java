package CoreJava.Java8Features.DefaultAndStaticMethodsInInterfaces.Static;
interface Shape{
    void draw();
    static Shape create(String type){
        switch (type.toLowerCase()){
            case "circle": return new Circle();
            case "square": return new Square();
            default: throw new IllegalArgumentException("Unknown shape type");
        }
    }
}
class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a circle...");
    }

}
class Square implements Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a square...");
    }
}
public class FactoryMethodPattern {
    public static void main(String[] args) {
        Shape circle=Shape.create("circle");
        circle.draw();
        Shape square=Shape.create("square");
        square.draw();
    }
}
