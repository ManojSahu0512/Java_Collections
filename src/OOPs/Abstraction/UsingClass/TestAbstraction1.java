package OOPs.Abstraction;

abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing Rectangle.");

    }
}
class Circle1 extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing circle.");

    }
}
public class TestAbstraction1 {
    public static void main(String[] args) {
        Shape shape=new Circle1();
        shape.draw();
        Shape shape1=new Rectangle();
        shape1.draw();
//Drawing circle.
//Drawing Rectangle.

        Circle1 circle1=new Circle1();
        circle1.draw();
        Rectangle rectangle=new Rectangle();
        rectangle.draw();
        //Drawing circle.
        //Drawing Rectangle.
    }
}
