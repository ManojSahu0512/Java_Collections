package Coding.Arrays.ArraySorting;

import java.util.Arrays;

public class SubArraysSorting {
    public static void main(String[] args) {
        int[] numbers={1,20,10,2,3,3,5};
        Arrays.sort(numbers,0,4);//// Sorts from index 0 (inclusive) to 4 (exclusive)
        System.out.println(Arrays.toString(numbers));


    }

}
