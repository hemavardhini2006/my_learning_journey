import java.util.*;

public class NextGreaterElement {

    public static int[] nextGreater(int[] arr) {

        int n = arr.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        // Step 2: Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Step 3: Remove smaller elements
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // Step 4: Assign answer
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            // Step 5: Push current element
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 10};

        int[] ans = nextGreater(arr);

        System.out.println("Next Greater Elements:");
        System.out.println(Arrays.toString(ans));
    }
}
