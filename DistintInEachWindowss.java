import java.util.*;
public class DistintInEachWindowss {

    public static int countSubstrings(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;

        // First window (0 to k-1)
        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Check first window
        if (map.size() == k - 1) {
            count++;
        }

        // Sliding window
        for (int i = k; i < s.length(); i++) {

            // Remove left character
            char left = s.charAt(i - k);
            map.put(left, map.get(left) - 1);

            if (map.get(left) == 0) {
                map.remove(left);
            }

            // Add new character
            char right = s.charAt(i);
            map.put(right, map.getOrDefault(right, 0) + 1);

            // Check condition
            if (map.size() == k - 1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "aaabc";
        int k = 3;

        System.out.println(countSubstrings(s, k));
    }
}