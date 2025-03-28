package Coding.PrepInsta100Code.Numbers;

public class PalindromeNumber {
    public static boolean isPalindrome(int num){
        int rev=0;
        int original=num;
        while (num>0){
            rev=rev*10+num%10;
            num=num/10;
        }
        if(rev==original) return true;
        return false;

    }

    public static void main(String[] args) {
        int num=121;
        int num1=200;
        System.out.println(isPalindrome(num));
        System.out.println(isPalindrome(num1));
    }
}
