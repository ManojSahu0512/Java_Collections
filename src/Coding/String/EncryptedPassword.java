package Coding.String;
/*11
middle-Outz
2
Sample Output

okffng-Qwvb

Example: If c = 'Z' (position 25) and k = 3, then 25 + 3 = 28. But there's no 28th letter (since the alphabet has only 26 letters), so we need to wrap around.

(c - 'A' + k) % 26:

The modulo operation % 26 ensures that the result stays within the range 0 to 25 (the valid positions in the alphabet).

This handles the wrap-around when the shift goes past 'Z'.*/
public class EncryptedPassword {
    public static String caesarCipher(String s, int k) {
        StringBuilder encrypted = new StringBuilder();
        k = k % 26; // Handle cases where k is larger than 26
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                char shifted = (char) ('A' + (ch - 'A' + k) % 26);
                encrypted.append(shifted);
            } else if (Character.isLowerCase(ch)) {
                char shifted = (char) ('a' + (ch - 'a' + k) % 26);
                encrypted.append(shifted);
            } else {
                encrypted.append(ch);
            }
        }
        return encrypted.toString();
    }

    public static void main(String[] args) {
        String str="middle-Outz";
        int k=3;//increment by 3
        System.out.println(caesarCipher(str,k));
        //plggoh-Rxwc

    }
}
