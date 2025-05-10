package Coding.Arrays.ArraySorting;

import java.util.Arrays;

public class UsingCustomComparator {
    public static void main(String[] args) {
        String[] names = {"John", "Alice", "Bob", "Zoe"};
        Arrays.sort(names,(a,b)->b.compareTo(a));//// Descending alphabetical
        System.out.println(Arrays.toString(names));//[Zoe, John, Bob, Alice]
    }
}
