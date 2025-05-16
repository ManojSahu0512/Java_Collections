package CoreJava.Java8Features.DefaultAndStaticMethodsInInterfaces.Static;
interface MathUtils{
    static int add(int a,int b){
        return a+b;
    }
    static int multiply(int a,int b){
        return a*b;
    }
}

public class TestStatic {
    public static void main(String[] args) {

        System.out.println(MathUtils.add(10,20));//30
        System.out.println(MathUtils.multiply(10,20));//200
    }
}
