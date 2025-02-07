package Coding.Arrays;

import java.util.Arrays;

public class LeftArrayRotation {

    /*
    Optimal solutions
     */
    public static int[] optimalSolution(int[] arr,int k){
        int size=arr.length;
        k=k%size;
        if(k==0){
            return arr;
        }
        reverse(arr,0,k-1);
        reverse(arr,k,size-1);
        reverse(arr,0,size-1);

        return arr;
    }
    public static void reverse(int[] arr,int leftIndex,int rightIndex){
        while (leftIndex<rightIndex){
            int temp=arr[leftIndex];
            arr[leftIndex]=arr[rightIndex];
            arr[rightIndex]=temp;
            leftIndex++;
            rightIndex--;

        }
    }

    public static int[] normalSolution(int[] arr,int k){
        int size=arr.length;
        k=k%size;
        int[] temp=new int[size];
        int j=0;
        for(int i=k;i<size;i++){
            temp[j]=arr[i];
            j++;

        }
        for(int i=0;i<k;i++){
            arr[size-k+i]=arr[i];
        }
        for(int i=0;i<size-k;i++){
            arr[i]=temp[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        arr=optimalSolution(arr,2);
        for (int num:arr){
            System.out.println(num);
        }
        int[] arr2 = {100, 200, 300, 400, 500, 600};
        arr2=normalSolution(arr2,2);
        for (int num:arr2){
            System.out.println(num);
        }

    }
}

/*
30
40
50
60
10
20
=========
300
400
500
600
100
200
 */
