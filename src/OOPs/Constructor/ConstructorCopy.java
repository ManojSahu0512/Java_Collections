package OOPs.Constructor;

class Student6 {
    int id;
    String name;

    //constructor to initialize integer and string
    Student6(int i, String n) {
        id = i;
        name = n;
    }

    //constructor to initialize another object
    Student6(Student6 s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

    public class ConstructorCopy {
    public static void main(String[] args) {
        Student6 student6=new Student6(100,"ANC");
        Student6 student=new Student6(student6);
        student.display();            ///100 ANC

    }
}
