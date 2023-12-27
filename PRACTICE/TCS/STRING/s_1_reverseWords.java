package PRACTICE.TCS.STRING;

public class s_1_reverseWords {
    static String reverseWOrds(String str) {
        String[] words = str.split("\\.");

        // for (String word : words) {
        // System.out.print(word + ".");
        // }

        String ans = "";
        for (int i = words.length - 1; i >= 0; i--) {
            if (i == 0) {
                ans += words[i];
            }
            else{
                ans += words[i] + ".";
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";
        // reverseWOrds(str);
        System.out.println(reverseWOrds(str));
    }
}
