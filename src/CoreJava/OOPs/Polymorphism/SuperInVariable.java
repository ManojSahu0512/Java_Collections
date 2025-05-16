package CoreJava.OOPs.Polymorphism;

class Animal{
    String color="yellow";
}
class Dog extends Animal{
    String color="Black";

    void PrintColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class SuperInVariable {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.PrintColor();
    }
}
//Black
//yellow