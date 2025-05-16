package CoreJava.Java8Features.FunctionalInterfaces.Function.BiFunction;


import java.util.function.BiFunction;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class BiFunctionWithCustomObject {
    public static void main(String[] args) {
        BiFunction<String, Integer, Employee> createEmployee = (name, salary) -> new Employee(name, salary);
        Employee emp = createEmployee.apply("Ravi", 45000);
        System.out.println(emp.name + " earns " + emp.salary); // Ravi earns 45000
    }
}
