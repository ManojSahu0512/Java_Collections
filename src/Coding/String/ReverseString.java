package Coding.String;

import Coding.Arrays.Sort012S;

public class ReverseString {
    public static String ReverseOfString(String str){
        String s=str.replaceAll("\\s","");
        String string=new StringBuilder(s).reverse().toString();
        return string;




    }
    public static String ReverseStringUsingForLoop(String str){
        String reversedString="";
        for(int i=str.length()-1;i>=0;i--){
            reversedString+=str.charAt(i);
        }
        return reversedString;
    }

    public static void main(String[] args) {
        String str="Hello india";
        System.out.println(ReverseOfString(str));
        System.out.println(ReverseStringUsingForLoop(str));

    }

}
