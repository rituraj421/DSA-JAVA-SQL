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

    // count symmetric pairs
    static void symmetricPai(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i][0] == A[j][1] && A[i][1] == A[j][0]) {
                    System.out.println(A[i][0] + "," + A[i][1]);
                }
            }
        }
    }

    // count rocks
    static void rocks(int[] sample, int[][] range) {
        int count1 = 0;
        int count2 = 0;

        // Arrays.sort(sample);
        for (int j = 0; j < 2; j++) {
            int l1 = range[j][0];
            int l2 = range[0][1];
            int h = range[j][0];
            int h2 = range[j][j];
            for (int i = 0; i < sample.length; i++) {
                if (sample[i] >= l1 && sample[i] <= l2) {
                    count1++;
                }
                if (sample[i] >= h && sample[i] <= h2) {
                    count2++;
                }
            }
        }
        System.out.println(count1 + " " + count2);
    }

    // reverse array ir string 
    static void reverse(int[] arr){
        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        // int[] arr = { -1, 2, -1, 3, 2 };
        // nonRepeat(arr);

        // int[] arr = { 1, 2, 3, 4, 5 };
        int d = 2;
        // rotate(arr, d);

        int[][] A = { { 11, 20 },
                { 30, 40 },
                { 5, 10 },
                { 40, 30 },
                { 10, 5 } };
        // symmetricPai(A);

        int[] sample = { 345, 604, 321, 433, 704, 470, 808, 718, 517, 811 };
        int[][] ranges = {
                { 300, 380 },
                { 400, 700 }
        };

        rocks(sample, ranges);

        // reverse array
        int[] arr = {1,2,3};
        reverse(arr);

    }
}
