package Coding.PrepInsta100Code.Numbers;

public class GreatestOfThreeNumbers {

    public static int greatestOfThreeNumbers(int first,int second,int third){
        return Math.max(first,Math.max(second,third));
    }

    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;
        System.out.println(greatestOfThreeNumbers(a,b,c));
    }
}
