package Java8Features.LambdaExpression;


//datatype and return type is not required
@FunctionalInterface
interface MathOperation{
    int operation(int a,int b);

}
public class LambdaWithParameters {
    public static void main(String[] args) {
        MathOperation addOperation = (a, b) -> {
            return a + b;
        };
        MathOperation multiplyOperation = (a, b) -> {
            return a * b;
        };

        addOperation.operation(10, 20);
        multiplyOperation.operation(10, 20);
        System.out.println("Addition: " + addOperation.operation(10, 20));
        System.out.println("Multiplication: " + multiplyOperation.operation(10, 20));

        /*(String str)->{
        retrun str.length();
                  }

    (str)->str.length;

         */

    }

}

/*
Addition: 30
Multiplication: 200

 */
