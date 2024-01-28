package Love_SDE_Sheet;

import java.util.Arrays;

public class l_sde_2_arraySubset {
    static String arraySubset(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        int x = a.length;
        int y = b.length;

        int i = 0;
        int j = 0;
        while (i != x && j != y) {
            if (a[i] > a[j]) {
                i++;
            } else if (a[i] == a[j]) {
                i++;
                j++;
            } else {
                return "No";
            }
        }
        if (j == y) {
            return "Yes";
        }
        return "No";
    }

    public static void main(String[] args) {
        // Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to
        // check whether a2[] is a subset of a1[] or not. Both the arrays can be sorted
        // or unsorted. There can be duplicate elements.

        int a[] = { 8, 4, 5, 3, 1, 7, 9 };
        int b[] = { 5, 1, 3, 7, 9 };

        System.out.println(arraySubset(a, b));
    }
}
