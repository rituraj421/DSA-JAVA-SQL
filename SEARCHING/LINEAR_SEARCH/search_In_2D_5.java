package SEARCHING.LINEAR_SEARCH;

import java.util.Arrays;

public class search_In_2D_5 {

    static int[] Double(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 23, 2, 3 },
                { 11, 34, 55, 43 },
                { 22, 34, 67, 89 },
                { 15, 22 }
        };
        int target = 22;
        int ans[] = Double(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}
