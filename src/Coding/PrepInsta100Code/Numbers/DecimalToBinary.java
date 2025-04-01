package Coding.PrepInsta100Code.Numbers;

public class DecimalToBinary {
    public static String decimalToBinary(int decimalNum){
        return Integer.toBinaryString(decimalNum);
    }

    public static void main(String[] args) {
        int num = 25;
        System.out.println(decimalToBinary(num));//11001
    }
}
