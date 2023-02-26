package leetcode.STRING.EASY;

public class find_First_Palindromic_String_In_The_Array_2108 {
    static String firstPalindrome(String[] words) {

        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            sb.append(word).reverse();
            if (word.equals(sb.toString())) {
                return word;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String[] words = { "abc", "car", "ada", "racecar", "cool" };
        System.out.println(firstPalindrome(words));
        ;
    }
}
