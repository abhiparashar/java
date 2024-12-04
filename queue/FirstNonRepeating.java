package queue;

import java.util.HashMap;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "abcaceb";
        char ch = findFirstNonRepeating(str);
        System.out.println(ch);
    }

    public static char findFirstNonRepeating(String str) {
        // Count frequencies
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Find first character with count 1
        for (char ch : str.toCharArray()) {
            if (charCount.get(ch) == 1) {
                return ch;
            }
        }

        // If no non-repeating character found
        return '#';
    }
}