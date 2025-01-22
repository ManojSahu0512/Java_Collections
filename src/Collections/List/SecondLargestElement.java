package Collections.List;

public class SecondLargestElement {

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

    public static void main(String[] args) {


        int[] arr ={12,35,1,10,34,1};
        System.out.println(getSecondLargest(arr));

    }
}
