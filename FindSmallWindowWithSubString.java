import java.util.*;
public class FindSmallWindowWithSubString {

    public static String smallestWindow(String s, String p) {

        if (s.length() < p.length()) {
            return "";
        }

        HashMap<Character, Integer> pMap = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();

        for (char ch : p.toCharArray()) {
            pMap.put(ch,
                    pMap.getOrDefault(ch, 0) + 1);
        }

        int required = pMap.size();
        int formed = 0;

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            windowMap.put(ch,
                    windowMap.getOrDefault(ch, 0) + 1);

            if (pMap.containsKey(ch) &&
                windowMap.get(ch).equals(pMap.get(ch))) {

                formed++;
            }

            while (formed == required) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                windowMap.put(leftChar,
                        windowMap.get(leftChar) - 1);

                if (pMap.containsKey(leftChar) &&
                    windowMap.get(leftChar) <
                    pMap.get(leftChar)) {

                    formed--;
                }

                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start,
                start + minLen);
    }
    public static void main(String[] args){
        String s = "timetopractice";
        String p = "toc";
        String res = smallestWindow(s,p);
        System.out.println(res);
    }
}
