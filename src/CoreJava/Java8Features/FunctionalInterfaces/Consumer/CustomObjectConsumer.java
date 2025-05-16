package CoreJava.Java8Features.FunctionalInterfaces.Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

}

public class CustomObjectConsumer {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(new Student("sahil", 100),
                new Student("sohan", 99),
                new Student("Ram", 98));

        Consumer<Student> printStudents=s-> System.out.println("Name:"+s.name+",Scored-"+s.marks);
        students.forEach(printStudents);
    }
}
