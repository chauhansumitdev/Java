package Stack;
import java.util.*;


public class ValidParenthesis {
    
    public static void main(String[] args) {
        String test1 = "((()))";
        testExpression(test1);

        String test2 = "(())";
        testExpression(test2);

        String test3 = "(())())";
        testExpression(test3);

        String test4 = "((()))))";
        testExpression(test4);
    }

    public static void testExpression(String input) {
        boolean result = isValid(input);
        System.out.println("Is the expression valid? " + result);
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
    
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else {
                return false;
            }
        }
    
        return stack.isEmpty();
    }
    
}

