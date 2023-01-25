package leetcode.STRING.MEDIUM;

public class split_A_String_In_Balanced_Strings_1221 {
    class Solution {
        public int balancedStringSplit(String s) {
            int count = 0;
            int balance = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'R') {
                    balance++;
                } else {
                    balance--;
                }
                if (balance == 0) {
                    count++;
                }
            }
            return count;
        }
    }
}