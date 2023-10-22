package GFG.GFG_00_Practice;

import java.util.HashSet;
import java.util.Set;

public class GFG_7_doUnion {
    static int doUnion(int[] A, int[] B) {
        Set<Integer> set1 = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            set1.add(A[i]);
        }
        for (int i = 0; i < B.length; i++) {
            set1.add(B[i]);
        }

        int ans = set1.size();
        System.out.println(set1);
        return ans;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        int[] B = { 1, 2, 3 };

        System.out.println(doUnion(A, B));
    }
}
