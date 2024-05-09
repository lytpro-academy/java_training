package basics;

/**
 * Time Complexity: The time complexity of the factorial function is O(n). This is because the function calls itself
 * n times (in a recursive manner), and for each call, it performs a constant amount
 * of work (a single multiplication operation).
 *
 * Space Complexity: The space complexity of the function is also O(n), because there are n recursive calls,
 * each of which adds a level to the call stack. The call stack is a data structure that holds information about active
 * subroutines or function calls in a program, and each recursive call to a function adds a new layer to the stack,
 * thus using more memory. So, the amount of memory used is
 * proportional to n (the height of the recursion tree or depth of the recursion).
 * */
public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}