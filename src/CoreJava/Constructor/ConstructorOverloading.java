package CoreJava.Constructor;
class Employee{
    int empId;
    String empName;
    String location;
    //creating two arg constructor
    Employee(int empId,String empName){
        this.empId=empId;
        this.empName=empName;



    }
    //creating three arg constructor
    Employee(int empId,String empName,String location){
        this.empId=empId;
        this.empName=empName;
        this.location=location;

    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Employee employee=new Employee(100,"Sany");
        Employee employee1=new Employee(101,"Amit","Lucknow");

    }
}
