package leetcode.STRING.EASY;

public class valid_Palindrome_125 {
    static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sb = new StringBuilder();
        sb.append(str).reverse();
        if (str.toLowerCase().equals(sb.toString().toLowerCase())) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));

    }
}
