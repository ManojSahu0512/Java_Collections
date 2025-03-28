package Coding.PrepInsta100Code.Numbers;

public class SumOfFirstNNaturalNumbers {
    public static  int sumOfNNum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;

    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(sumOfNNum(n));
    }

}
