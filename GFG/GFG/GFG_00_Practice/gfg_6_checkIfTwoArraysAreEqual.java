package GFG.GFG_00_Practice;

import java.util.Arrays;
import java.util.HashSet;
// import java.util.Set;

public class gfg_6_checkIfTwoArraysAreEqual {
    static boolean check(int[] A, int[] B) {
        if (A.length != B.length) {
            return false;
        }
        Arrays.sort(A);
        Arrays.sort(B);

        boolean result = Arrays.equals(A, B);
        return result;
    }

    // method 2 using hashmap
    static boolean check1(int[] A, int[] B) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set1.add(A[i]);
        }
        for (int i = 0; i < B.length; i++) {
            if (!set1.contains(B[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 15 };
        int[] B = { 2, 16 };
        System.out.println(check(A, B));

        System.out.println(check1(A, B));
    }
}
