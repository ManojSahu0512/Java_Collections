package Coding.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        /*

       @Algorithm Explanation
Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order.
After each pass, the largest element "bubbles up" to its correct position.

Step-by-Step Iterations
Given Array: {5, 3, 8, 4, 2}

Iteration 1 (First Pass)
Compare 5 and 3 → Swap → {3, 5, 8, 4, 2}
Compare 5 and 8 → No Swap → {3, 5, 8, 4, 2}
Compare 8 and 4 → Swap → {3, 5, 4, 8, 2}
Compare 8 and 2 → Swap → {3, 5, 4, 2, 8}
✅ Largest element 8 is now at the last position.
Iteration 2 (Second Pass)
Compare 3 and 5 → No Swap → {3, 5, 4, 2, 8}
Compare 5 and 4 → Swap → {3, 4, 5, 2, 8}
Compare 5 and 2 → Swap → {3, 4, 2, 5, 8}
✅ 5 is now in the correct position.
Iteration 3 (Third Pass)
Compare 3 and 4 → No Swap → {3, 4, 2, 5, 8}
Compare 4 and 2 → Swap → {3, 2, 4, 5, 8}
✅ 4 is now in the correct position.
Iteration 4 (Fourth Pass)
Compare 3 and 2 → Swap → {2, 3, 4, 5, 8}
✅ 3 is now in the correct position.
Final Sorted Array
{2, 3, 4, 5, 8}
         */

        int arr[]={2, 3, 4, 5, 8};
        int size= arr.length;
        for(int i=0;i<size-1;i++){
            // Number of passes
            for(int j=0;j<size-i-1;j++){
                // Compare adjacent elements
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;


                }

            }

        }
        for(int num:arr){
            System.out.println(num);
        }




    }
}
