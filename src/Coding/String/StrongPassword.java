package Coding.String;
/*Louise joined a social networking site to stay in touch with her friends. The signup page required her to input a name and a password. However, the password must be strong. The website considers a password to be strong if it satisfies the following criteria:

Its length is at least .
It contains at least one digit.
It contains at least one lowercase English character.
It contains at least one uppercase English character.
It contains at least one special character. The special characters are: !@#$%^&*()-+
She typed a random string of length  in the password field but wasn't sure if it was strong. Given the string she typed, can you find the minimum number of characters she must add to make her password strong?

Note: Here's the set of types of characters in a form you can paste in your solution:
*/
public class StrongPassword {
    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int num = 0;
        int lowercase = 0;
        int uppercase = 0;
        int specialchar = 0;
        int remaining = 0;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                num++;
            } else if (Character.isUpperCase(password.charAt(i))) {
                uppercase++;
            } else if (Character.isLowerCase(password.charAt(i))) {

                lowercase++;
            } else {
                specialchar++;
            }
        }
        if (num == 0) {
            remaining++;
        }
        if (lowercase == 0) {

            remaining++;
        }
        if (uppercase == 0) {
            remaining++;
        }
        if (specialchar == 0) {
            remaining++;
        }
        if (password.length() >= 6) {
            return remaining;
        } else {
            return Math.max(remaining, 6 - n);
        }
    }

        public static void main(String[] args) {
        String password="2bbbb";
        System.out.println(minimumNumber(password.length(),password));
        String pasword="#Hackerrank";
        System.out.println(minimumNumber(pasword.length(),pasword));



    }
}
