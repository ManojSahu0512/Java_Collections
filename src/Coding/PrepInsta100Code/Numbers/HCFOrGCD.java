package Coding.PrepInsta100Code.Numbers;

public class HCFOrGCD {
    public static int findHCF(int a,int b){

        int gcd=1;
        int min=Math.min(a,b);
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                gcd=i;

            }
        }
        return gcd;

    }
}
