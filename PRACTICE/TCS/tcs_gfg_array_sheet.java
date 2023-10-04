package PRACTICE.TCS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class tcs_gfg_array_sheet {
    // non repeating elements( NOT DONE)
    static void nonRepeat(int[] arr) {
        Arrays.sort(arr);
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (hs.contains(arr[i])) {
                hs.remove(arr[i]);
            } else {
                hs.add(arr[i]);
            }
        }
        ArrayList<Integer> ar = new ArrayList<Integer>(hs);
        System.out.println(ar.get(0));

    }

    // ROTATE ARRAY
    static void rotate(int[] arr, int d) {
        int[] ans = new int[d];
        int[] ans1 = new int[arr.length];
        int index = 0;
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = d; i < arr.length; i++) {
            ar.add(arr[i]);
            ans1[index] = arr[i];
            // ans1[i] = arr[i];
            index++;
        }
        for (int i = 0; i < d; i++) {
            ar.add(arr[i]);
            ans1[index] = arr[i];
            index++;
        }
        System.out.println(ar);
        for (int i = 0; i < ans1.length; i++) {
            System.out.print(ans1[i] + " ");
        }
        // System.out.println(ans1);
    }

    // equilibrium index
    static String equilibrium(int[] arr) {
        int left = 0; // stores the element to the left of equilibrium element(if exists)
        int total = 0; // store sum of total elements
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (left == (total - arr[i])) {
                return "YES";
            }
            left += arr[i];
            total -= arr[i];
        }
        return "NO";
    }

    public static void main(String[] args) {
        // int[] arr = { -1, 2, -1, 3, 2 };
        // nonRepeat(arr);

        int[] arr = { 1, 2, 3, 4, 5 };
        int d = 2;
        rotate(arr, d);
    }
}
