package Coding.PrepInsta100Code.Numbers;

public class HexadecimalToDecimal {
    public static int hexadecimalToDecimal(String hexaNum){
        return Integer.parseInt(hexaNum,16);

    }

    public static void main(String[] args) {
        String hex = "1A";  // Hexadecimal representation of 26

        System.out.println(hexadecimalToDecimal(hex));//26
    }
}
