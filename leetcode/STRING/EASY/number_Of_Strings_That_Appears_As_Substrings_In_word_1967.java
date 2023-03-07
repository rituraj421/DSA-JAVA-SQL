package leetcode.STRING.EASY;

public class number_Of_Strings_That_Appears_As_Substrings_In_word_1967 {
    static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String p : patterns) {
            if (word.contains(p)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] patterns = { "a", "abc", "bc", "d" };
        String word = "abc";
        System.out.println(numOfStrings(patterns, word));
    }
}
