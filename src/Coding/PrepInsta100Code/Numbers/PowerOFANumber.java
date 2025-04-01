package Coding.PrepInsta100Code.Numbers;

public class PowerOFANumber {
    public static long powerOfNum(int base,int exponent){
        long ans=(long)Math.pow(base,exponent);
        return ans;

    }

    public static void main(String[] args) {
        int base=10;
        int exp=10;
        System.out.println(powerOfNum(base,exp));
    }
}
