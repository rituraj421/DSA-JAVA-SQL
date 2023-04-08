package leetcode.SORTING.EASY;

import java.util.Arrays;

public class maximum_Product_Of_Two_Elements_In_An_Array_1464 {
    static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int product = 0;
        for (int i = 0; i < nums.length; i++) {
            product = ((nums[n - 1] - 1) * (nums[n - 2] - 1));
        }
        return product;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 2 };
        System.out.println(maxProduct(nums));
    }
}
