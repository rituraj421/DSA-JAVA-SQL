package GFG_5_SEARCHING;

import java.util.Arrays;

public class sheet_1 {

    // Q1, majority element
    static int majority(int[] arr) {
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            }
            if (count == arr.length / 2) {
                return arr[i];
            }
            if (arr[i] != arr[i + 1]) {
                count = 0;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Q1, majority element
        int[] arr = { 3, 1, 3, 3, 2 };
        System.out.println(majority(arr));
    }
}
