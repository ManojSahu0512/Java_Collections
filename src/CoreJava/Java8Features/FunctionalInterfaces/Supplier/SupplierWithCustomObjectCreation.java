package CoreJava.Java8Features.FunctionalInterfaces.Supplier;

import java.util.function.Supplier;

class Student {
    String name = "Vipul";
    int age = 25;

    @Override
    public String toString() {
        return name + " - " + age;
    }
}
public class SupplierWithCustomObjectCreation {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier=()->new Student();
        Student student=studentSupplier.get();
        System.out.println(student);//Vipul - 25
    }

}
