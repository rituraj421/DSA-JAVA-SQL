package leetcode.LEETCODE75;

public class Merge_Strings_Alternately_1768 {
    static String mergeAlternately(String word1, String word2) {
        int a = word1.length();
        int b = word2.length();
        String ans = new String();
        int i = 0, j = 0;
        while (i < a || j < b) {
            if (i < a) {
                ans = ans + word1.charAt(i);
                i++;
            }
            if (j < b) {
                ans = ans + word2.charAt(j);
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }
}
