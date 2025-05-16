package CoreJava.OOPs.Polymorphism;

class Animal4{
    Animal4(){System.out.println("animal is created");}
}
class Dog4 extends Animal4{
    Dog4(){
        System.out.println("dog is created");
    }
}
public class SuperBydefault {
    public static void main(String args[]){
        Dog4 d4=new Dog4();
    }
}
//animal is created
//dog is created
