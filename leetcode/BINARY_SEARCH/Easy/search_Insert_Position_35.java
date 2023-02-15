package leetcode.BINARY_SEARCH.Easy;

public class search_Insert_Position_35 {
    static int searchInsert(int[] nums, int target) {
        int ans = 0;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
                ans = mid;

            } else if (target > nums[mid]) {
                start = mid + 1;
                ans = mid + 1;
            } else {
                return mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 5, 6 };
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }
}
