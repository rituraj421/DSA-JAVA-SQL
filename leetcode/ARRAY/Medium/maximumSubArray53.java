package leetcode.ARRAY.Medium;

public class maximumSubArray53 {
    class Solution {
        public int maxSubArray(int[] nums) {
            int maxSum = Integer.MIN_VALUE;
            int currSum = 0;
            for (int x : nums) {
                currSum = Math.max(currSum + x, x);
                maxSum = Math.max(maxSum, currSum);
            }
        return maxSum;
        }
    }
}