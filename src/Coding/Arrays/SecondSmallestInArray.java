package Coding.Arrays;

public class SecondSmallestInArray {
    public static int secondSmallest(int[] arr){
        int smallest=arr[0];
        int secSmallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                secSmallest=smallest;
                smallest=arr[i];
            } else if (arr[i]!=smallest && arr[i]<secSmallest) {
                secSmallest=arr[i];

            }
        }
        return secSmallest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 90, 90, 20, 50,50,20};

        int secondSmallest=secondSmallest(arr);
        System.out.println("Second smallest:"+secondSmallest);

    }
}


//Second smallest:20