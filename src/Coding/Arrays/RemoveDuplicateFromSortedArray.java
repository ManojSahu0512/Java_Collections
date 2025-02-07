package Coding.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
/**
//Optimal Approach: Two Pointers (O(N) Time Complexity)
//Since the array is already sorted, all duplicates will be adjacent. We can use the Two Pointers Approach to solve this efficiently in O(N) time and O(1) space.
//
//Algorithm:
//Use two pointers:
//i (slow pointer) → Tracks the position for unique elements.
//j (fast pointer) → Iterates over the array to find unique elements.
//If arr[j] != arr[i], move i forward and update arr[i] = arr[j].
//Continue until the end of the array.
//The new length of the array will be i + 1.


//Time & Space Complexity Analysis
//Time Complexity: O(N), since we traverse the array only once.
//Space Complexity: O(1), as we modify the array in place without using extra space.
**/

/**Drawback: Uses extra space (O(N)) due to LinkedHashSet.
 *
 */
public class RemoveDuplicateFromSortedArray {
    public static int[] removeDuplicate(int[] arr){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[++i]=arr[j];
            }
        }
        return Arrays.copyOf(arr,i+1);

    }
    public static int[] RemoveDuplicateAarr(int[] arr){
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>();
        for (int num:arr){
            linkedHashSet.add(num);
        }
        return linkedHashSet.stream().mapToInt(Integer::intValue).toArray();


    }

    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,5,8,9};
        arr=removeDuplicate(arr);

        System.out.println(Arrays.toString(arr));////[1, 2, 3, 4, 5, 8, 9]

        int[] arr2={10,20,20,30,40,40,50,80,90};
        for (int num:RemoveDuplicateAarr(arr2)){
            System.out.print(num+" ");
        }
               //10 20 30 40 50 80 90
    }
}


/*
✅ Use the Two Pointers Approach (O(1) space) if in-place modification is required.
❌ Avoid using a Set unless extra space is not a concern.
 */