package Coding.PrepInsta100Code.Numbers;

public class ReverseNumber {
    public static int reverse(int num){
        int rev=0;
        while(num>0){
            rev=rev*10+num%10;
            num=num/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int num=12345;
        System.out.println(reverse(num));
        String str="12345";
        System.out.println(reverse(Integer.parseInt(str)));
    }
}
