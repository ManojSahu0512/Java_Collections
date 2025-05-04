package Java8Features.StreamAPI;

import java.util.Arrays;

public class TestExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        // Using a traditional for loop
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("Sum of even numbers (using for loop): " + sum);

        // Using Streams API
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int sum2 = Arrays.stream(arr2)
                .filter(n -> n % 2 == 0) // Filtering even numbers
                .sum(); // Summing them up

        System.out.println("Sum of even numbers (using Streams API): " + sum2);
    }
}
