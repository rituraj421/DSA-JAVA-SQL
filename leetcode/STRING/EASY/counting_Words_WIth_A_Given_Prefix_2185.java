package leetcode.STRING.EASY;

public class counting_Words_WIth_A_Given_Prefix_2185 {
    class Solution {
        public int prefixCount(String[] words, String pref) {
            int count = 0;
            // String [] word = words.split(" ");
            for (String word : words) {
                if (word.indexOf(pref) == 0) {
                    count++;
                }

            }
            return count;
        }
    }
}