import java.util.*;

public class NextSmallerElement {

    public static int[] nextSmaller(int[] arr) {

        int n = arr.length;
        int[] result = new int[n];

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = n - 1; i >= 0; i--) {

            // Remove all greater or equal elements
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            // If stack empty, no smaller element
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            // Push current element
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 6, 3};
        int[] ans = nextSmaller(arr);

        System.out.println("Next Smaller Elements:");
        System.out.println(Arrays.toString(ans));
    }
}