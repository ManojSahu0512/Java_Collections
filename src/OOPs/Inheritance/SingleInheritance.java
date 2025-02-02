package OOPs.Inheritance;


class Animal{
    public void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("Barking...");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();//Eating..
        d.bark(); //Barking...

    }
}
