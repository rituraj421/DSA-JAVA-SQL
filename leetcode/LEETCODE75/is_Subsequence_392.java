package leetcode.LEETCODE75;

public class is_Subsequence_392 {
    static boolean isSubsequence(String s, String t) {
        int indexS = 0;
        int indexT = 0;

        while (indexS < s.length() && indexT < t.length()) {
            if (s.charAt(indexS) == t.charAt(indexT)) {
                indexS++;
            }
            indexT++;
        }
        return s.length() == indexS;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
