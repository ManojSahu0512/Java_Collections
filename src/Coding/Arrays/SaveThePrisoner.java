package Coding.Arrays;

public class SaveThePrisoner {
    public static int saveThePrisoner(int n, int m, int s) {
        // Write your code here
        /*
        s - 1:
Convert s (1-based index) to 0-based index, because modular arithmetic is easier to work with 0-based.

m - 1:
The last candy is the (m-1)-th candy after the first one (because we already give the first candy to the start seat s).

(s - 1 + m - 1): This gives the 0-based index of the prisoner who gets the last candy.

% n:
Since prisoners are sitting in a circle, we use % n to wrap around if we exceed the total number of prisoners.

+ 1:
Convert the 0-based result back to 1-based seat number.
         */
        return ((s - 1 + m - 1) % n) + 1;


    }

    public static void main(String[] args) {
        int n=5;
        int m=2;
        int s=1;
        System.out.println(saveThePrisoner(n,m,s));
    }
}
