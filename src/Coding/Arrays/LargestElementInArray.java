package Coding.Arrays;

//Normal
//using shorting method

//Best
//using traversing of the array


import java.util.Arrays;
import java.util.Collection;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr ={3,2,1,5,7};

        Arrays.sort(arr);  //nlogn
        System.out.println("largest is:"+arr[arr.length-1]); //7

//*************Best solution*******************
        int[] arr1 ={30,20,10,50,7};
        int largest=arr1[0];

        for (int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr1[i];
            }
        }
        //O(N)
        System.out.println("largest is:"+largest);

    }
}

//largest is:7
//largest is:30