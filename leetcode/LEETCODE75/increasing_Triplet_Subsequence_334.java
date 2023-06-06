package leetcode.LEETCODE75;

public class increasing_Triplet_Subsequence_334 {
    static boolean increasingTriplet(int[] nums) {
        int start = Integer.MAX_VALUE;
        int end = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= start) {
                start = n;
            } else if (n <= end) {
                end = n;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println(increasingTriplet(nums));

        int a = Integer.MAX_VALUE;
        System.out.println(a);
    }
}
