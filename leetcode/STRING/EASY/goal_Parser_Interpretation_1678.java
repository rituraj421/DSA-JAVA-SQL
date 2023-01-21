package leetcode.STRING.EASY;

// You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.

// Given the string command, return the Goal Parser's interpretation of command.

public class goal_Parser_Interpretation_1678 {
    public class GoalParser {
        public String interpret(String command) {
            StringBuilder sb = new StringBuilder();
            for (char c : command.toCharArray()) {
                if (c == 'G') {
                    sb.append("G");
                } else if (c == '(') {
                    if (command.charAt(command.indexOf('(') + 1) == ')') {
                        sb.append("o");
                    } else {
                        sb.append("al");
                    }
                }
            }
            return sb.toString();
        }
    }
}

// an alternate and easy solution which does not require looping

class Solution {
    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}