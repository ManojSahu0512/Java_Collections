package CoreJava.Java8Features.StreamAPI.Filter;

import java.util.Arrays;
import java.util.List;

class Student{
    String name;
    int marks;
    public Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    @Override
    public String toString(){
        return name+" "+marks;
    }
}
public class FilterStudentsByMarks {
    public static void main(String[] args) {


        List<Student> students = Arrays.asList(
                new Student("Amit", 85),
                new Student("Ravi", 45),
                new Student("Sita", 65)
        );
        List<Student> passed=students.stream().filter(s->s.marks>=50).toList();
        System.out.println(passed);//[Amit 85, Sita 65]

    }
}
