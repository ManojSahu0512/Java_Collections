package Coding.String;

import java.util.ArrayList;
import java.util.List;

public class FunnyString {
    public static String funnyString(String s) {
        // Write your code here
        List<Integer> AbsasciiValueDiff=new ArrayList<>();
        for(int i=0;i<s.length()-1;i++){
            int value=Math.abs((s.charAt(i)-s.charAt(i+1)));
            AbsasciiValueDiff.add(value);

        }
        List<Integer> AbsasciiValueReverseDiff=new ArrayList<>();
        for(int i=s.length()-1;i>=1;i--){
            int resValue=Math.abs(s.charAt(i)-s.charAt(i-1));
            AbsasciiValueReverseDiff.add(resValue);
        }

        if(AbsasciiValueDiff.equals(AbsasciiValueReverseDiff)){
            return "Funny";
        }
        else{
            return "Not Funny";
        }
    }
    public static String funnyStringOptimal(String s) {
        String reversed = new StringBuilder(s).reverse().toString();

        List<Integer> originalDiffs = new ArrayList<>();
        List<Integer> reversedDiffs = new ArrayList<>();

        for (int i = 0; i < s.length() - 1; i++) {
            originalDiffs.add(Math.abs(s.charAt(i) - s.charAt(i + 1)));
            reversedDiffs.add(Math.abs(reversed.charAt(i) - reversed.charAt(i + 1)));
        }

        return originalDiffs.equals(reversedDiffs) ? "Funny" : "Not Funny";
    }
    public static void main(String[] args) {
        String str="acxz";
        System.out.println(funnyString(str));
    }

}
