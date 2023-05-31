package leetcode.LEETCODE75;

public class reverse_Vovels_Of_A_String_345 {
    static boolean isVowel(char c) {
        c = Character.toLowerCase(c); // to avoid case sensitivity
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (isVowel(chars[start]) && isVowel(chars[end])) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            } else if (isVowel(chars[start])) {
                end--;
            } else {
                start++;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(reverseVowels(s));
    }
}
