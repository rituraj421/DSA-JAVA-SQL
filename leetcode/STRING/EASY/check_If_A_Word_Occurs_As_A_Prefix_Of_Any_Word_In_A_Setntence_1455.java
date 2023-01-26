package leetcode.STRING.EASY;

public class check_If_A_Word_Occurs_As_A_Prefix_Of_Any_Word_In_A_Setntence_1455 {
    class Solution {
        public int isPrefixOfWord(String sentence, String searchWord) {
            String[] word = sentence.split(" ");
            for (int i = 0; i < word.length; i++) {
                if (word[i].startsWith(searchWord)) {
                    i++;
                    return i;
                }
            }
            return -1;
        }
    }
}
