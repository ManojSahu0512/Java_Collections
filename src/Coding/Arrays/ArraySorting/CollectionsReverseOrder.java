package Coding.Arrays.ArraySorting;

import java.util.Arrays;
import java.util.Collections;

public class CollectionsReverseOrder {
    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 9, 1, 5, 6}; // Must use Integer instead of int

        Arrays.sort(numbers, Collections.reverseOrder());
    }
}
