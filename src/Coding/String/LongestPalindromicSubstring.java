package Coding.String;

public class LongestPalindromicSubstring {
    public static boolean isPalindrome(String str){
        int low=0;
        int high=str.length()-1;
        while(low<high){
            if(str.charAt(low++)!=str.charAt(high--)){
                return false;
            }
        }
        return true;

    }public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        String longest = "";

        // Check all possible substrings
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                if (isPalindrome(substring) && substring.length() > longest.length()) {
                    longest = substring;
                }
            }
        }

        return longest;
    }
    public static void main(String[] args) {
        String s="babad";
        System.out.println(longestPalindrome(s));

    }
}
