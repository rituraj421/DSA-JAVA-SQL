package leetcode.SORTING.MEDIUM;

import java.util.Arrays;

public class check_If_A_String_Can_Break_Another_String_1433 {
    static boolean checkIfCanBreak(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < arr1.length; i++) {
            int diff = arr1[i] - arr2[i];

            if (diff >= 0) {
                count1++;
            } 
            if (diff <= 0) {
                count2++;
            }
        }
        return count1 == arr2.length || count2 == arr2.length;

    }

    public static void main(String[] args) {
        String s1 = "abe";
        String s2 = "acd";
        System.out.println(checkIfCanBreak(s1, s2));
    }
}
