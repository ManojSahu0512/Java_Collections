package CoreJava.OOPs.Inheritance;

class Animal1 {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Barking...");
    }
}

class Cat extends Animal1 {
    void Meow() {
        System.out.println("Meow...");
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {

        Cat c = new Cat();
        c.Meow();
        c.eat();
        //c.bark();    compile time error
        //Meow...
        //Eating...
    }

}
