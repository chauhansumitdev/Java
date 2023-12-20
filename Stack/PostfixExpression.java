package Stack;

import java.util.Stack;

import Sorting.Insertion;

public class PostfixExpression {

    /*
     * Example:
     * Input: "34+5*"
     * This corresponds to the infix expression (3 + 4) * 5.
     * Expected Output: 35
     */
    public static void main(String[] args) {
        // Test case
        String postfixExpression = "34+5*";
        int result = evaluatePostfix(postfixExpression);
        System.out.println("Result of the postfix expression \"" + postfixExpression + "\" is: " + result);
    }

    public static int evaluatePostfix(String str) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<str.length();i++){
            
            if(Character.isDigit(str.charAt(i))){
                int current = Character.getNumericValue(str.charAt(i));
                stack.push(current);
            }else{
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (str.charAt(i)) {
                    case '+':
                        stack.push(val1+val2);
                        break;
                    case '-':
                        stack.push(val1-val2);
                        break;
                    case '/':
                        stack.push(val1/val2);
                        break;    
                    case '*':
                        stack.push(val1*val2);
                        break;
                }
            }
        }

        return stack.pop();
    }
}
