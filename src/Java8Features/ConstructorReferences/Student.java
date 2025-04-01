package Java8Features.ConstructorReferences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        List<String> names= Arrays.asList("Alice","Bob","Charlie");
        List<Student> students=names.stream().map(x->new Student(x)).collect(Collectors.toList());
        //we can use constructor reference instead of lambda function

        List<Student> students1=names.stream().map(Student::new).collect(Collectors.toList());

    }
}
