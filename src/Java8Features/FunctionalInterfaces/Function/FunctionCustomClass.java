package Java8Features.FunctionalInterfaces.Function;

import java.util.function.Function;

class Employee{
    String name;
    int salary;
    public Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
}
public class FunctionCustomClass {
    public static void main(String[] args) {
        Function<Employee,String> getName=emp->emp.name;
        Function<Employee ,Integer>getSalary=emp->emp.salary+5000;

        Employee e=new Employee("sohan",1000);
        System.out.println("Name:"+getName.apply(e));
        System.out.println("Salary"+getSalary.apply(e));
    }

}
