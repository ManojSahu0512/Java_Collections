package CoreJava.OOPs.Aggregation;

class Operation {
    public int square(int n) {
        return n * n;
    }
}

class Circle{
    Operation op;
    double pi=3.14;

    public double area(int radius){
        op=new Operation();
        int rsquare=op.square(radius);     ////code reusability (i.e. delegates the method call).
        return pi*rsquare;
    }


}

public class HasA{
    public static void main(String[] args) {

        Circle c=new Circle();

        double result= c.area(15);
        System.out.println("Result:"+result); //Result:706.5
    }
}

