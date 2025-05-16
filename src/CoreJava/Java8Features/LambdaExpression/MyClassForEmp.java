package CoreJava.Java8Features.LambdaExpression;

public class MyClassForEmp {
    public static void main(String[] args) {
        Employee employee=()-> "Software Engineer";

        System.out.println(employee.getName());

        Employee editor=()->"Editor";
        System.out.println(editor.getName());
    }
}
