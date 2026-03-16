import java.util.Stack;
public class InfixToPostfix {

    static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '^') return 3;
        return -1;
    }

    public static String convert(String s) {

        Stack<Character> stack = new Stack<>();
        String result = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // If operand → add to result
            if (Character.isLetterOrDigit(ch)) {
                result += ch;
            }

            // If '(' → push to stack
            else if (ch == '(') {
                stack.push(ch);
            }

            // If ')' → pop until '('
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }
                stack.pop();
            }

            // If operator
            else {

                while (!stack.isEmpty() &&
                       precedence(stack.peek()) >= precedence(ch)) {

                    result += stack.pop();
                }

                stack.push(ch);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {

        String exp = "a*(b+c)/d";

        String postfix = convert(exp);

        System.out.println("Postfix Expression: " + postfix);
    }
}

