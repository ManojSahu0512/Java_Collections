package Coding.PrepInsta100Code.Numbers;

public class ArmstrongNumbers {
    public static boolean isArmstrongNumber(int num){
        int original=num;
        int totalDigits = String.valueOf(num).length();
        int sum=0;
        while (num > 0) {
            int digit = num % 10;   // Extract the last digit
            sum = sum + (int) Math.pow(digit, totalDigits); // Raise to the power of totalDigits and add to sum
            num = num / 10;         // Remove the last digit (reduce number)
        }
        if(original==sum){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int num=153;
        System.out.println("\""+ num + "\"" +" is an Armstrong number? " + isArmstrongNumber(num));

        //for given Range;
        int start=1;
        int end=1000;
        for(int i=start;i<end;i++){
            if(isArmstrongNumber(i)){
                System.out.print(i+" ");
            }
        }
    }

}
