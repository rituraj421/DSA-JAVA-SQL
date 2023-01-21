package leetcode.STRING.EASY;

import java.util.HashSet;
import java.util.Set;

// A pangram is a sentence where every letter of the English alphabet appears at least once.

// Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

public class check_If_The_Sentence_Is_Pangram_1832 {
    class Solution {
        public boolean checkIfPangram(String sentence) {
            Set<Character> chars = new HashSet<>();
            for (char c : sentence.toCharArray()) {
                chars.add(c);
            }
            for (char c = 'a'; c <= 'z'; c++) {
                if (!chars.contains(c)) {
                    return false;
                }
            }

            return true;
        }
    }
}