package leetcode.SORTING.EASY;

import java.util.Arrays;

public class MAXIMUM_Product_Difference_Between_Two_Pairs_1913 {
    static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);

        int last = nums[nums.length - 1];
        int secondLast = nums[nums.length - 2];

        int first = nums[0];
        int second = nums[1];

        int result = last * secondLast - first * second;
        return result;

    }

    public static void main(String[] args) {
        int[] nums = { 5, 6, 2, 7, 4 };
        System.out.println(maxProductDifference(nums));
    }
}
