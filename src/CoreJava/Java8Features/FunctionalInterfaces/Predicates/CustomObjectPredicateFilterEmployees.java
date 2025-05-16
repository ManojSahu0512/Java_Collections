package CoreJava.Java8Features.FunctionalInterfaces.Predicates;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}

public class CustomObjectPredicateFilterEmployees {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Vipul", 30),
                new Employee("Arnav", 25),
                new Employee("Ravi", 22)
        );

        Predicate<Employee> isGreaterThan25=e->e.age>25;

        List<Employee> filtered=employees.stream().filter(isGreaterThan25).toList();
        System.out.println(filtered);


    }
}
