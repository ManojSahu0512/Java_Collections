package Java8Features.LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student{
    public Integer id;
    public String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Stduent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class SortingUsingStudentObj {
    public static void main(String[] args) {
        Student s1=new Student(1,"Vipul");
        Student s2=new Student(2,"Sanjay");
        Student s3=new Student(23,"JAJ");

        List<Student> li=new ArrayList<Student>();
        li.add(s1);
        li.add(s2);
        li.add(s3);
        Collections.sort(li,(a,b)->b.id-a.id);
        System.out.println(li);
    }




}
