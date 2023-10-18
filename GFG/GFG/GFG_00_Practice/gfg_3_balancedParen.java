package GFG.GFG_00_Practice;

import java.util.Stack;

public class gfg_3_balancedParen {
    static boolean balancedparen(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && stack.peek() != '(') {
                return false;
            } else if (c == '}' && stack.peek() != '{') {
                return false;
            } else if (c == ']' && stack.peek() != '[') {
                return false;
            } else {
                stack.pop();
            }
        }
        if (stack.empty()) {
            return true;
        }

        return stack.empty();
    }

    public static void main(String[] args) {
        // to check is the given string is valid parinthesis or not
        String str = "({[})";
        System.out.println(balancedparen(str));
    }
}
