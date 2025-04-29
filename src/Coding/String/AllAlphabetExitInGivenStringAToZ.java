package Coding.String;

import java.util.HashSet;
import java.util.Set;

public class AllAlphabetExitInGivenStringAToZ {
    public static String pangrams(String s) {
        Set<Character> letter = new HashSet<>();
        String lowerCaseStr = (s.toLowerCase()).replaceAll("\\s", "");

        for (int i = 0; i < lowerCaseStr.length(); i++) {
            letter.add(lowerCaseStr.charAt(i));
        }
        if (letter.size() == 26) {
            return "pangram";
        } else {
            return "not pangram";
        }

    }

    public static void main(String[] args) {
        String str = "We promptly judged antique ivory buckles for the " +
                "prize";
        System.out.println(pangrams(str));//"not pangram"
        String str2 = "We promptly judged antique ivory buckles for the next " +
                "prize";
        System.out.println(pangrams(str2));//pangram

    }
}
