package leetcode.STRING.EASY;

public class generate_A_String_With_Characters_That_Have_Odd_Counts_1373 {
    class Solution {
        public String generateTheString(int n) {
            StringBuilder odd = new StringBuilder();
            if (n % 2 == 0) {
                odd.append('a');
                for (int i = 1; i < n; i++)
                    odd.append('b');
            } else {
                for (int i = 0; i < n; i++)
                    odd.append('a');
            }
            return odd.toString();
        }
    }
}
