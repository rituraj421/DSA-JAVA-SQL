package PRACTICE.TCS;

import java.util.HashSet;

public class tcs_2_sheet2 {
    // Q1 palindrome
    static boolean palin(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {
            return true;
        }
        // System.out.println(rev);
        return false;
    }

    // Q2 remove characters
    static void rem(String str1, String str2) {
        String ans = "";
        for (int i = 0; i < str1.length(); i++) {
            boolean found = false;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                ans += str1.charAt(i);
            }
        }
        System.out.println(ans);
    }

    // Q5 remove adjacent duplicate
    static final int Ch = 256;
    static void removeDup(String str){
        char[] count = new char[Ch]; 
        for(int i = 0; i<str.length(); i++){
            count[str.charAt(i)]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j<str.length(); j++)
        if (count[str.charAt(j)] %2 != 0){
             sb.append(str.charAt(j));
        }
        sb.toString();
        HashSet<Character> ans = new HashSet<>();
        for(int i = 0; i<sb.length(); i++){
            ans.add(sb.charAt(i));
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        // String str = "aba";
        // System.out.println(palin(str));

        // Q2 remove characters
    //     String str1 = "computer";
    //     String str2 = "cat";
    //     rem(str1, str2);

    // Q3 remove duplicate
    String str = "abbaca";
    removeDup(str);
    }
}
