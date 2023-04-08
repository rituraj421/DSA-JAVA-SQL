package leetcode.SORTING.EASY;

public class maximum_Product_Of_Two_Elements_In_An_Array_II_1464 {
    static int maxProduct1(int[] nums) {
        int max1 = 0;
        int max2 = 0;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        return ((max1 - 1) * (max2 - 1));
    }

    public static void main(String[] args) {
        int[] nums = { 1, 5, 4, 5 };
        System.out.println(maxProduct1(nums));
    }
}
