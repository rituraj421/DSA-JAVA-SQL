package GFG_4_STRINGS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class str_1_Sheet {
    // Q1 , palindrome check
    static void palindrome(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("sahi h");
        } else {
            System.out.println(str);
            System.out.println(rev);
        }
    }

    // another approach with stringBuilder
    static void palindrome1(String str) {
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        if (str.equals(rev.toString())) {
            System.out.println("Its a palindrome");
        } else {
            System.out.println(str);
            System.out.println(rev);
        }
    }

    // another approach which isd more efficient
    static boolean palindrome3(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Q2, subsequence
    static boolean subsequence(String str, String str1) {
        // StringBuilder sb = new StringBuilder(str1);
        if (str.contains(str1)) {
            return true;
        }
        return false;

    }

    // better approach
    static boolean subsequence1(String str, String str1) {
        int s1 = str.length();
        int s2 = str1.length();
        int j = 0;
        for (int i = 0; i < s1 && j < s2; i++) {
            if (str.charAt(i) == str1.charAt(j)) {
                j++;
            }
        }
        return (j == s2);
    }

    // check for anagrams
    static boolean anagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        s1 = new String(c1);

        char[] c2 = s2.toCharArray();
        Arrays.sort(c2);
        s2 = new String(c2);

        return (s1.equals(s2));
    }

    // more efficient way
    static final int CHAR = 256;

    static boolean anagram1(String s1, String s2) {
        // final int CHAR = 256;
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] count = new int[CHAR];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for (int i = 0; i < CHAR; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    // leftmost occurance
    static int leftOccur(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return (i);
                }
            }
        }
        return -1;
    }

    // efficient approach
    static final int Ch = 256;
    static int leftOccur1(String str){
        char[] count = new char[Ch];
        for(int i = 0; i<str.length(); i++){
            count[str.charAt(i)]++;
        }
        for(int j = 0; j<Ch; j++){
            if(count[str.charAt(j)]>1){
                return j;
            }
        }
        return -1;
    }

    // leftmost non repeating character
    static final int ch = 256;
    static int nonOccur1(String str){
        char[] count = new char[ch];
        for(int i = 0; i<str.length(); i++){
            count[str.charAt(i)]++;
        }
        for(int j = 0; j<ch; j++){
            if(count[str.charAt(j)]<=1){
                return j;
            }
        }
        return -1;
    }
    // reverse the given string 
    static void reverseStr(String str){
       char[] charArray = str.toCharArray();
        
        // Create an ArrayList to hold characters in reverse order
        ArrayList<Character> charList = new ArrayList<>();
        for (char c : charArray) {
            charList.add(c);
        }
        
        // Reverse the ArrayList
        Collections.reverse(charList);
        
        // Build the reversed string from the ArrayList
        StringBuilder reversedString = new StringBuilder(charList.size());
        for (char c : charList) {
            reversedString.append(c);
        }

        
        System.out.println(reversedString);
    }
    // pattern searching (Naive approach) 
    static void pattern(String str1, String str2){
        int m = str1.length();
        int n = str2.length();
        for(int i = 0; i<=m-n; i++){
            int j;
            for(j = 0; j<n; j++){
                if(str1.charAt(i+j)!=str2.charAt(j)){
                    break;
                }
            }
            if(j == n){
                System.out.println(i +" ");
            }
        }
    }

    // reverse words in a string 
    static void strRev(String str){
        String[] word = str.split(" ");

        StringBuilder semiAns = new StringBuilder();    
        
        for(int i = word.length-1; i>=0; i--){
            semiAns.append(word[i]).append(" ");
        }

        System.out.println(semiAns.toString());
    }
    public static void main(String[] args) {
        //
        // char x = 'A';
        // System.out.println((int) x);

        // Q1, palindrome
        // String str = "ababa";
        // palindrome(str);
        // palindrome1(str);
        // System.out.println(palindrome3(str));
        // String str = "ababacd";
        // String str1 = "ad";
        // System.out.println(subsequence(str, str1));
        // System.out.println(subsequence1(str, str1));

        // check for anagram , v8
        // String s1 = "aab";
        // String s2 = "bab";
        // String s1 = "listen";
        // String s2 = "silent";
        // System.out.println(anagram(s1, s2));
        // System.out.println(anagram1(s1, s2));

        // String str = "geeksforeeks";
        // System.out.println(leftOccur(str));
        // System.out.println(leftOccur1(str));

        // leftmost non occuring character
        // String str = "geeksforgeeks";
        // System.out.println(nonOccur1(str));

        // reverse the string 
        // String str = "geeksforgeeks";
        // reverseStr(str);

        // String str = "hey ritu";
        // reverseStr(str);

        // String str1 = "aaaaa";
        // String str2 = "aa";
        // pattern(str1, str2);

        // reverse words in string 
        String str = "hey ritu";
        strRev(str);
    }
}
