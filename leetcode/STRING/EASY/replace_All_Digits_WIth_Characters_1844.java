package leetcode.STRING.EASY;

public class replace_All_Digits_WIth_Characters_1844 {
    public static void main(String[] args) {

        String s = "a1c1e1";
        System.out.println(replaceDigits(s));

    }

    static String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 1; i < s.length(); i += 2) {
            char c = s.charAt(i - 1);
            int shift = Character.getNumericValue(s.charAt(i));
            char shifted = (char) (c + shift);
            sb.setCharAt(i, shifted);
        }
        return sb.toString();
    }
}
