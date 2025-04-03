package Coding.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArrayWithSign {
    public static int[] rearrange(int[] arr){
        int n=arr.length;
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        int j=0;
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pos[j++]=arr[i];
            }
            else {
                neg[k++]=arr[i];
            }

        }
        for(int i=0;i<n/2;i++){
            arr[2*i]=pos[i];
            arr[2*i+1]=neg[i];
        }
        return arr;
    }

    public  static int[] rearrangeAlternativeSign(int[] arr){
        ArrayList<Integer> posList=new ArrayList<>();
        ArrayList<Integer> negList=new ArrayList<>();
        for(int num:arr){
            if(num>0){
                posList.add(num);
            }
            else {
                negList.add(num);
            }
        }
        int i=0,j=0,k=0;
        int[] result=new int[arr.length];

        // Arrange alternately
        while (i < posList.size() && j < negList.size()) {
            result[k++] = posList.get(i++);
            result[k++] = negList.get(j++);
        }

        // If there are extra positive numbers
        while (i < posList.size()) {
            result[k++] = posList.get(i++);
        }

        // If there are extra negative numbers
        while (j < negList.size()) {
            result[k++] = negList.get(j++);
        }

        return result;


    }

    public static void main(String[] args) {
        int[] arr={1,9,-3,-4,-2,5,7,-8};
        int[] result=new int[arr.length];
        result=rearrange(arr);
        for (int num:result){
            System.out.println(num);
        }
        int[] arr2={1,9,-3,-4,-2,5,7,-8,99,88};
        int[] result2=new int[arr2.length];
        result2=rearrangeAlternativeSign(arr2);
        for (int num:result2){
            System.out.println(num);
        }




    }
}
