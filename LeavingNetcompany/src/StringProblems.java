import java.util.Stack;

public class StringProblems {
    public boolean isValidParentheses(String s) {
        Stack<String> stack = new Stack<String>();

        for (var i = 0; i < s.length(); i++) {
            var c = String.valueOf(s.charAt(i));

            if (!"(){}[]".contains(c))
                continue;

            if ((")".equals(c) || "}".equals(c) || "]".equals(c)) && stack.empty())
                return false;


            if ((")".equals(c) && "(".equals(stack.peek())) || ("}".equals(c) && "{".equals(stack.peek())) || ("]".equals(c) && "[".equals(stack.peek()))) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.empty();
    }

    public boolean isPalindrome(String s) {
        for (var i = 0; i < s.length() / 2; i++) {
            var left = String.valueOf(s.charAt(i));
            var right = String.valueOf(s.charAt(s.length() - i - 1));

            if (!left.equals(right)) {
                return false;
            }
        }

        return true;
    }
}
