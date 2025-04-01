package Coding.PrepInsta100Code.Numbers;

public class DecimalToOctal {
    public static String decimaltoOctal(int num){
        return Integer.toOctalString(num);
    }

    public static void main(String[] args) {
        int num = 125;
        System.out.println(decimaltoOctal(num));
    }
}
