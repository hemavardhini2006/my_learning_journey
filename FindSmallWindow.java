import java.util.*;
class FindSmallWindow {
    public static int smallestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() == 3) {

                minLen = Math.min(minLen,
                        right - left + 1);

                char leftChar = s.charAt(left);

                map.put(leftChar,
                        map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? -1
                : minLen;
    }
    public static void main(String[] args){
        String s = "001122212";
        int res = smallestSubstring(s);
        System.out.println(res);
    }
}
