package Coding.PrepInsta100Code.Numbers;

public class StrongNumber {

    public static int fact(int num){
        if(num==0 || num==1) return 1;
        return num*fact(num-1);
    }

    public static boolean isStrongNumber(int num){
        int original=num;
        int sum=0;
        while(num>0){
            sum=sum+fact(num%10);
            num=num/10;
        }
        if(sum==original) return true;
        return false;


    }

    public static void main(String[] args) {
        int n=145;
        System.out.println(isStrongNumber(n));  //true
    }


}
