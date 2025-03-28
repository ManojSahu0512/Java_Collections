package Coding.PrepInsta100Code.Numbers;

public class PrimeNumber {
    public static boolean isPrime(int num){
        if(num<=1) return false;
        if(num==2 || num==3) return true;
        if(num%2==0 || num%3==0) return false;

        for(int i=5;i*i<=num;i+=6){
            if(num%i==0 || num%(i+2)==0) return false;

        }
        return true;
    }

    public static void main(String[] args) {
        int intial =10;
        int finalValue=500;
        for(int i=intial;i<=finalValue;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
