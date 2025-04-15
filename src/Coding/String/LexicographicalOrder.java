package Coding.String;

public class LexicographicalOrder {
    public static String biggerIsGreater(String w) {
        // Write your code here
        int[] arr=new int[w.length()];
        int i=0;
        for(char ch:w.toCharArray()){
            arr[i++]=(int)ch;
        }
        for(int j=arr.length-1;j>0;j--){
            if(arr[j]>arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                break;
            }
            else{
                return "no answer";
            }
        }
        StringBuilder result=new StringBuilder();
        for(int acii:arr){
            result.append((char)acii);
        }
        return result.toString();

    }

    public static void main(String[] args) {

    }
}
