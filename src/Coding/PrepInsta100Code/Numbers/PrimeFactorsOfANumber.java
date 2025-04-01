package Coding.PrepInsta100Code.Numbers;

public class PrimeFactorsOfANumber {
    public static void findPrimeFactors(int num) {
        // Step 1: Remove all factors of 2
        while (num % 2 == 0) {
            System.out.print(2 + " ");
            num /= 2;
        }

        // Step 2: Check for odd factors from 3 to √n
        for (int i = 3; i * i <= num; i += 2) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }

        // Step 3: If num is still greater than 2, it's prime itself
        if (num > 2) {
            System.out.print(num);
        }
    }

    public static void main(String[] args) {
        int number = 84;
        System.out.print("Prime Factors of " + number + " are: ");
        findPrimeFactors(number);
    }
}
