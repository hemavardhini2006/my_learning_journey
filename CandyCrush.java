import java.util.Stack;
import java.util.*;

public class CandyCrush {

    // Pair class
    static class Pair {
        char ch;
        int count;

        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public static String reduceString(String s, int k) {

        Stack<Pair> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // If new character
            if (stack.isEmpty() || stack.peek().ch != ch) {
                stack.push(new Pair(ch, 1));
            } 
            else {
                // Same character → increase count
                stack.peek().count++;

                // If count reaches k → remove
                if (stack.peek().count == k) {
                    stack.pop();
                }
            }
        }

        // Build result
        StringBuilder result = new StringBuilder();

        for (Pair p : stack) {
            for (int i = 0; i < p.count; i++) {
                result.append(p.ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "abbbaac";
        int k = 3;

        System.out.println(reduceString(s, k)); // Output: c
    }
}