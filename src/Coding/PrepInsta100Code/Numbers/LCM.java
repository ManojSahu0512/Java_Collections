package Coding.PrepInsta100Code.Numbers;

public class LCM {
    public static int LCMBruteForce(int a, int b){
        int max=Math.max(a,b);
        while(true){
            if(max%a==0 && max%b==0){
                return max;
            }
            max++;
        }
    }
    public static int findHCM(int a, int b) {
        return (a * b) / LCMBruteForce(a, b);
    }
    public static void main(String[] args) {
        int a=10;
        int b=15;
        System.out.println(LCMBruteForce(a,b));
        System.out.println(findHCM(a,b));
    }
}
