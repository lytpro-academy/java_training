package mockInterview;

import java.util.Stack;

public class BalanceParentheses {
                                                // "{()}[]"
    public static boolean areParenthesesBalanced(String expr) {
        // Create a new stack
        Stack<Character> stack= new Stack<>();

        // Iterate over the input expression
        for (int i=0; i<expr.length();i++) {
            // Get the current character from the input string
            char x = expr.charAt(i);

            // If the current character is an opening bracket, push it into the stack
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }

            // If the stack is empty at this point, return false because
            // there are no opening brackets available for this closing bracket
            if (stack.isEmpty())
                return false;

            // Placeholder for the character on the top of the stack
            char check;
            switch (x) {
                // For each closing bracket type, pop from the stack and check if the
                // popped bracket is matching with the closing bracket. If not, return false.
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        // After the completion of the loop, if there are still opening brackets left in stack then return false.
        // If the stack is empty, return true, which means all brackets are correctly closed.
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // The string to be checked
        String expr = "{()}[]";
        // Check if the brackets in the string are balanced
        if (areParenthesesBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}

/**
 * The time complexity of this program is O(n), where n is the length of the string. This is because each character in
 * the string is processed exactly once.
 * The space complexity is also O(n) in the worst case. This is because in the worst-case scenario, the string contains
 * only opening brackets which are all pushed onto the stack, resulting in a stack size that equals the length of the string.
 * Here are the complexities:
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * */