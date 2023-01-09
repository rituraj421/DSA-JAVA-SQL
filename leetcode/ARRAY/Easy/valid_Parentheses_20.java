package leetcode.ARRAY.Easy;

import java.util.Stack;

public class valid_Parentheses_20 {

    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char topChar = stack.pop();
                    if (c == ')' && topChar != '(') {
                        return false;
                    }
                    if (c == ']' && topChar != '[') {
                        return false;
                    }
                    if (c == '}' && topChar != '{') {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
    }

}