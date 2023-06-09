package leetcode.LEETCODE75;

import java.util.Arrays;

public class max_Number_Of_k_Sum_Pairs_1679 {
    static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == k) {
                count++;
                start++;
                end--;
            } else if (sum < k) {
                start++;
            } else {
                end--;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 5;
        System.out.println(maxOperations(nums, k));
    }
}
