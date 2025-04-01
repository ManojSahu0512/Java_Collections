package Coding.PrepInsta100Code.Numbers;

public class BinaryToDecimal {
    public static int BtoDOptimal(String binaryNum){
        return Integer.parseInt(binaryNum,2);


    }
    public static int binaryToDecimal(int binary) {
        int decimal = 0, base = 1; // base starts at 1 (2^0)
        while (binary > 0) {
            int lastDigit = binary % 10;  // Extract last digit
            decimal += lastDigit * base;  // Multiply by place value
            base *= 2;  // Increase power of 2
            binary /= 10;  // Remove last digit
        }
        return decimal;
    }

    public static void main(String[] args) {
        String binaryNum="1010";
        System.out.println(BtoDOptimal(binaryNum));//10
    }
}
