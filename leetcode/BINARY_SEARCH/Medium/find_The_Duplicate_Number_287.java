package leetcode.BINARY_SEARCH.Medium;

public class find_The_Duplicate_Number_287 {
    static int findDuplicate(int[] nums) {
        // Arrays.sort(nums);
        int start = 1;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            int cnt = 0;
            for (int i = start; i< end; i++) {
                if (nums[i] <= nums[mid]){
                    cnt++;
                }
            }
            if (cnt > mid)
                end = mid;
            else
                start = mid + 1;
        }
        return start;

        // Arrays.sort(nums);
        // for (int i = 1; i < nums.length; i++) {
        // if (nums[i] == nums[i - 1]) {
        // return nums[i];
        // }
        // }
        // return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1,3,4,2,2 };
        System.out.println(findDuplicate(nums));
    }
}
