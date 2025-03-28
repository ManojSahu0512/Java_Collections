package Coding.PrepInsta100Code.Numbers;

public class SumDigitsNumber {
    public static int sum(int num){
        int sum=0;
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num=1234;
        String str="1234567890";
        System.out.println(sum(num));//10
        System.out.println(sum(Integer.parseInt(str)));//45
    }
}
