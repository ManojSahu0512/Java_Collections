package Coding.String;
import java.util.*;

public class Gemstones {
    public static int gemstones(List<String> rocks) {
        if (rocks == null || rocks.isEmpty()) {
            return 0;
        }

        // Initialize the set with minerals from the first rock
        Set<Character> commonMinerals = new HashSet<>();
        for (char mineral : rocks.get(0).toCharArray()) {
            commonMinerals.add(mineral);
        }

        // Iterate through each subsequent rock and retain only common minerals
        for (int i = 1; i < rocks.size(); i++) {
            Set<Character> currentRockMinerals = new HashSet<>();
            for (char mineral : rocks.get(i).toCharArray()) {
                currentRockMinerals.add(mineral);
            }
            commonMinerals.retainAll(currentRockMinerals);
            if (commonMinerals.isEmpty()) {
                break;
            }
        }

        return commonMinerals.size();
    }

    public static void main(String[] args) {
        List<String> rocks = Arrays.asList("abcdde", "baccd", "eeabg");
        System.out.println(gemstones(rocks)); // Output: 2
    }
}