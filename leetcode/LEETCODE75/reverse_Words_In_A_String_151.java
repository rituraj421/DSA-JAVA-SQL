package leetcode.LEETCODE75;

public class reverse_Words_In_A_String_151 {
    static String reverseWords(String s) {
        s = s.trim();

        String[] words = s.split("\\s+"); // Split the string by one or more spaces
        System.out.println(s);

        StringBuffer reverse = new StringBuffer();
        for (int i = words.length - 1; i >= 0; i--) {
            reverse.append(words[i]);
            if (i > 0) {
                reverse.append(" ");
            }
        }

        return reverse.toString();
    }

    public static void main(String[] args) {
        String s = "the sky   is blue";
        System.out.println(reverseWords(s));
    }
}
