package leetcode.SORTING.EASY;

import java.util.Arrays;

public class squares_Of_A_Sorted_Array_977 {
    static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] square = new int[n];
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;

        while (i <= j) {
            int left = nums[i] * nums[i];
            int right = nums[j] * nums[j];

            if (left > right) {
                square[k] = left;
                i++;
            } else {
                square[k] = right;
                j--;
            }
            k--;
        }
        return square;
    }

    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
