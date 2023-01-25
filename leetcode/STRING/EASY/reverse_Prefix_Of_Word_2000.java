package leetcode.STRING.EASY;

public class reverse_Prefix_Of_Word_2000 {
    class Solution {
        public String reversePrefix(String word, char ch) {
            int index = word.indexOf(ch);

            char[] chars = word.toCharArray();
            int left = 0;
            int right = index;
            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            return new String(chars);
        }
    }
}