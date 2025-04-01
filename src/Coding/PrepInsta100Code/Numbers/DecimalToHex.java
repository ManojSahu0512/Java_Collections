package Coding.PrepInsta100Code.Numbers;

public class DecimalToHex {
    public static String decimalToHexa(int num){
        return Integer.toHexString(num).toUpperCase();
    }

    public static void main(String[] args) {
        int num=124;
        System.out.println(decimalToHexa(num));
    }
}
