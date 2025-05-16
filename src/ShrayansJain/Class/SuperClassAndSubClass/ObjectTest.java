package ShrayansJain.Class.SuperClassAndSubClass;

import ShrayansJain.Class.AbstractClass.Audi;
import ShrayansJain.Class.ConcreteClass.Person;

public class ObjectTest {
    public static void main(String[] args) {
        ObjectTest obj=new ObjectTest();
        Object obj1=new Person(1);
        Object obj2=new Audi(10);
        System.out.println(obj1.getClass());
        System.out.println(obj2.getClass());
    }
}
//class ShrayansJain.Class.ConcreteClass.Person
//class ShrayansJain.Class.AbstractClass.Audi