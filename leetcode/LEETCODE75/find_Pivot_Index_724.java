package leetcode.LEETCODE75;

public class find_Pivot_Index_724 {
    static int pivotIndex(int[] nums) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            end += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            end -= nums[i];
            if (end == start) {
                return i;
            }
            start += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        System.out.println(pivotIndex(nums));
    }
}
