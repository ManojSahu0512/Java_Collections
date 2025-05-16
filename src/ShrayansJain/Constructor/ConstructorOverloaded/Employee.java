package ShrayansJain.Constructor.ConstructorOverloaded;

public class Employee {
    int age;
    String name;
    Employee(int age){//accept one parameter
        this.age=age;
        this.name=null;

    }
    Employee(int age,String name){//accept two parameter
        this.age=age;
        this.name=name;
    }
}
