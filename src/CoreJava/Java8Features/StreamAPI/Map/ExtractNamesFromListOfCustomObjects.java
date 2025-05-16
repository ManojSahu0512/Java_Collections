package CoreJava.Java8Features.StreamAPI.Map;

import java.util.Arrays;
import java.util.List;

class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

}

public class ExtractNamesFromListOfCustomObjects {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee("Ram", 1000),
                new Employee("shyam", 2000),
                new Employee("Janki", 5000));

        List<String>names=employeeList.stream().map(e->e.name).toList();
        System.out.println(names);//[Ram, shyam, Janki]

    }
}
