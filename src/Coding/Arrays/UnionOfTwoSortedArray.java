package Coding.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class UnionOfTwoSortedArray {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // add your code here
        TreeSet<Integer> set = new TreeSet<>();

        // Add elements of both arrays to TreeSet (automatically sorts & removes duplicates)
        for (int num : a) set.add(num);
        for (int num : b) set.add(num);

        // Convert to List and return
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 6, 7};
        List<Integer> result=new ArrayList<>();
        result=findUnion(a,b);
        for (int num:result){
            System.out.println(num+" ");
        }
    }
}
//1
//2
//3
//4
//5
//6
//7
