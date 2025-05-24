package ShrayansJain.Constructor.ConstructorChaining.This;

public class Calculation {
    String name;
    int empId;

    Calculation() {
        this(10);//calling Calculation(int id) constructor

    }

    Calculation(int id) {
        this("abc", id);//calling Calculation(CoreJava.String name,int id) constructor
    }

    Calculation(String name, int id) {
        this.name = name;
        this.empId = id;
    }

}
