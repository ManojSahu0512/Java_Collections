package Coding.PrepInsta100Code.Numbers;



public class GreatestOfTwoNumbers {
    public static int greatest(int first,int second){
        return Math.max(first,second);
    }

    public static void main(String[] args) {
        int first=10;
        int second=20;
        System.out.println(greatest(first,second));
    }
}
