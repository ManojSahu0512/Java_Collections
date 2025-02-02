package OOPs.MethodOverloading;

class Adder{
    int add(int a, int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        Adder adder=new Adder();
        System.out.println("Calling the add method with two integers "+adder.add(1,2));

        System.out.println("Calling the add method with two double "+adder.add(1.1,2.2));

    }
}
//Calling the add method with two integers 3
//Calling the add method with two double 3.3000000000000003