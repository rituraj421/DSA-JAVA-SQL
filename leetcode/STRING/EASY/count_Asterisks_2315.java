package leetcode.STRING.EASY;

public class count_Asterisks_2315 {
    class Solution {
        public int countAsterisks(String s) {
            int count = 0;
            int pipe = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '*' && pipe % 2 == 0) {
                    count++;
                }
                if (s.charAt(i) == '|') {
                    pipe++;

                }
            }
            return count;
        }
    }
}
