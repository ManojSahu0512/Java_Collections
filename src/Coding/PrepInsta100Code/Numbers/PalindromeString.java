package Coding.PrepInsta100Code.Numbers;

public class PalindromeString {

    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while (left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println("\"" + str + "\" is palindrome? " + isPalindrome(str));
        String[] words = {"amma", "mama", "dada"};
        String sentence="I Love my India";
        String[] words2=sentence.split("\\s+");// Splitting by spaces



        for(String word:words){
            System.out.println("\"" + word + "\" is palindrome? " + isPalindrome(word));

        }
        for(String word:words2){
            System.out.println("\"" + word + "\" is palindrome? " + isPalindrome(word));

        }

    }
}
