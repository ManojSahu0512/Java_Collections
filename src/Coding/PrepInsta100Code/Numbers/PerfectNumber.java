package Coding.PrepInsta100Code.Numbers;

public class PerfectNumber {
    public static boolean isPerfectNumber(int num) {
        if (num <= 1) return false; // 1 is not a perfect number

        int sum = 1; // Start with 1 because it's always a divisor

        // Find divisors up to sqrt(n) to optimize
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i; // Add the divisor
                if (i != num / i) { // Avoid adding the same divisor twice (e.g., for perfect squares)
                    sum += num / i;
                }
            }
        }

        return sum == num; // Check if the sum of divisors equals the number
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println(num + " is a Perfect Number? " + isPerfectNumber(num));

        int num2 = 28;
        System.out.println(num2 + " is a Perfect Number? " + isPerfectNumber(num2));

        int num3 = 12;
        System.out.println(num3 + " is a Perfect Number? " + isPerfectNumber(num3));
    }
}
