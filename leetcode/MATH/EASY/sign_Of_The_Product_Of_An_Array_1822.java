package leetcode.MATH.EASY;

public class sign_Of_The_Product_Of_An_Array_1822 {

    static int araySign(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            }
            if (nums[i] < 0) {
                count++;
            }
        }
        return count % 2 == 0 ? 1 : -1;
    }

    public static void main(String[] args) {
        int[] nums = { 9, 72, 34, 29, -49, -22, -77, -17, -66, -75, -44, -30, -24 };
        int ans = araySign(nums);
        System.out.println((ans));
    }
}
