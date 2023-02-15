package leetcode.BINARY_SEARCH.Medium;

import java.util.Arrays;

public class sort_An_Array_912 {

    static int[] sortANArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 5, 2, 1, 9, 0 };

        System.out.println(sortANArray(nums));
    }

}
