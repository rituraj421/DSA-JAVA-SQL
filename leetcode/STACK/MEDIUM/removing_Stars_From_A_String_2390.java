package leetcode.STACK.MEDIUM;

import java.util.Stack;

public class removing_Stars_From_A_String_2390 {

    static String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == 'e') {
                st.pop();
            } else {
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : st) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "let**code";
        System.out.println(removeStars(s));
    }
}
