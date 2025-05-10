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
    public static boolean isPrimeNum(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrimeOptimized(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
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
