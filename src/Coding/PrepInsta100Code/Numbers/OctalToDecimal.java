package Coding.PrepInsta100Code.Numbers;

public class OctalToDecimal {
    public static int OctalToDecimal(String octNum){
        return Integer.parseInt(octNum,8);

    }

    public static void main(String[] args) {
        String octal = "17";  // Octal representation of 15
        System.out.println(OctalToDecimal(octal));//15
    }
}
