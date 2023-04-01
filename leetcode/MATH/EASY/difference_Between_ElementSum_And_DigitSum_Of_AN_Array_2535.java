package leetcode.MATH.EASY;

public class difference_Between_ElementSum_And_DigitSum_Of_AN_Array_2535 {
    static int differenceOfSum(int[] nums) {
        int element = 0;
        int digit = 0;

        for (int num : nums) {
            element = element + num;

            while (num > 0) {
                digit = digit + (num % 10);
                num = num / 10;
            }
        }
        return Math.abs(element - digit);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 15, 6, 3 };
        System.out.println(differenceOfSum(nums));
    }
}
