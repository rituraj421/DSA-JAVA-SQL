package PRACTICE;

import java.util.Arrays;

public class acc_7_arrPro {
    static int sumPro(int[] arr, int sum) {
        Arrays.sort(arr);
        if (arr[0] + arr[1] <= sum) {
            return arr[0] * arr[1];
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // we will take an array as input and an integer sum
        // we need to find two such elements such that their sum is <= sum and return
        // their producd
        int[] arr = { 5, 2, 4, 3, 9, 7, 1 };
        System.out.println(sumPro(arr, 9));
    }
}
