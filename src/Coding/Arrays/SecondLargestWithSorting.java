package Coding.Arrays;

public class SecondLargestWithSorting {
    public static int getSecondLargest(int[] arr) {
        int largest=arr[0];
        int secLargest=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                secLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>secLargest){
                secLargest=arr[i];
            }
        }
        return secLargest;

    }
        public static void main (String[]args){
            int[] arr1 = {10, 90, 90, 20, 50,50};

            int secLargest=getSecondLargest(arr1);
            System.out.println("Second largest:"+secLargest);

        }


    }

//Second largest:50

