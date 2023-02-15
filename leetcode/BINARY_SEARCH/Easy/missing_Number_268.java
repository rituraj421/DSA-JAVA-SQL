package leetcode.BINARY_SEARCH.Easy;

public class missing_Number_268 {
    static int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = n * (n + 1) / 2;

        for (int num : nums) {
            ans = ans - num;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 0, 1 };
        System.out.println(missingNumber(nums));
    }
}
