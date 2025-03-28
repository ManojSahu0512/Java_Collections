package Coding.PrepInsta100Code.Numbers;

public class SumOfTheNumbersGivenInterval {
    public static int sum(int initialValue,int finalValue){
        int sum=0;
        for(int i=initialValue;i<=finalValue;i++){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int initial=5;
        int finalValue=10;
        System.out.println(sum(initial,finalValue));
    }
}
