package OOPs.Constructor;

class Student{
    int rollNo;
    String name;
    Student(int rollNo, String name){
        this.name=name;
        this.rollNo=rollNo;
    }
}

public class ParameterizedConstructor {

    public static void main(String[] args) {
        Student student1=new Student(103,"Sanjay");
    }

}
