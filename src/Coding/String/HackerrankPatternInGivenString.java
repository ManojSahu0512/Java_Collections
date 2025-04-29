package Coding.String;

/*We say that a string contains the word hackerrank if a subsequence of its characters spell the word hackerrank. Remeber that a subsequence maintains the order of characters selected from a sequence.
*
* 2
hhaacckkekraraannk
rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt
* Sample Output 1

YES
NO*/
public class HackerrankPatternInGivenString {
    public static String hackerrankInString(String s) {
        // Write your code here
        String target = "hackerrank";
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (index < target.length() && s.charAt(i) == target.charAt(index)) {
                index++;
            }
        }
        if (index == target.length()) {
            return "YES";
        } else {
            return "NO";
        }


    }

    public static void main(String[] args) {
        int query = 2;
        String[] str = new String[query];
        str[0] = "hhaacckkekraraannk";
        str[1] = "rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt";
        for (String s : str) {
            System.out.println(hackerrankInString(s));
        }
//YES
// No

    }
}
