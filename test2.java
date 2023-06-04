import java.util.HashMap;
import java.util.Map;

public class test2 {
    public static int firstUniqChar(String s) {
        // Create a map to store the count of each character
        Map<Character, Integer> charCount = new HashMap<>();

        // Iterate through the string to count the occurrences of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Iterate through the string again to find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // No non-repeating character found
        return -1;
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + firstUniqChar(s1));

        String s2 = "loveleetcode";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + firstUniqChar(s2));

        String s3 = "aabb";
        System.out.println("Input: " + s3);
        System.out.println("Output: " + firstUniqChar(s3));
    }
}
