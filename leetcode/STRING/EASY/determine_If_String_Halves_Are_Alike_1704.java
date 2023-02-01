package leetcode.STRING.EASY;

public class determine_If_String_Halves_Are_Alike_1704 {

    public static boolean vovels(char vovel) {
        if (vovel == 'a' || vovel == 'e' || vovel == 'i' || vovel == 'o' || vovel == 'u' || vovel == 'A' || vovel == 'E'
                || vovel == 'I' || vovel == 'O' || vovel == 'U') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        String s = "book";
        int count = 0;
        int count1 = 0;

        int length = s.length();

        for (int i = 0; i < length / 2; i++) {
            if (vovels(s.charAt(i))) {
                count++;
            }
        }

        for (int j = length / 2; j < length; j++) {
            if (vovels(s.charAt(j))) {
                count1++;
            }
        }

        if (count == count1) {
            System.out.println("correct");
        } else {

            System.out.println("false");
        }
    }
}

// LEETCODE DIRECT SOLUTION

/*

class Solution {

    public boolean vovels(char vovel) {
        if (vovel == 'a' || vovel == 'e' || vovel == 'i' || vovel == 'o' || vovel == 'u' || vovel == 'A' || vovel == 'E'
                || vovel == 'I' || vovel == 'O' || vovel == 'U') {
            return true;
        }
        return false;
    }

    public boolean halvesAreAlike(String s) {
        int count = 0;
        int count1 = 0;

        int length = s.length();

        for (int i = 0; i < length / 2; i++) {
            if (vovels(s.charAt(i))) {
                count++;
            }
        }

        for (int j = length / 2; j < length; j++) {
            if (vovels(s.charAt(j))) {
                count1++;
            }
        }

        if (count == count1) {
            return true;
        }
        return false;
    }

}

*/