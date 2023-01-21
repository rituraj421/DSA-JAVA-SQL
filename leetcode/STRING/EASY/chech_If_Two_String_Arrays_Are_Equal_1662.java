package leetcode.STRING.EASY;

public class chech_If_Two_String_Arrays_Are_Equal_1662 {
    class Solution {
        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

            return String.join("", word1).equals(String.join("", word2));
        }

    }
}
