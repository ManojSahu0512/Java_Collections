package Coding.PrepInsta100Code.Numbers;

import java.math.BigInteger;

public class Factorial {

    public static int factOptimal(int num){
        int fact=1;
        for(int i=2;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static long factorialRecursive(int n) {
        if(n==0 || n==1) return 1;
        return n*factorialRecursive(n-1);
    }
    public static BigInteger ForLargeFact(int num){
        BigInteger fact=BigInteger.ONE;
        for(int i=2;i<=num;i++){
            fact=fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public static void main(String[] args) {
        int n1=10;
        int n2=50;
        System.out.println(factOptimal(n1));
        System.out.println(factorialRecursive(n1));
        System.out.println(ForLargeFact(50));


    }
}
