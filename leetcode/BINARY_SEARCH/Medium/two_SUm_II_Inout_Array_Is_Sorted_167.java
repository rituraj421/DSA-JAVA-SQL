package leetcode.BINARY_SEARCH.Medium;

public class two_SUm_II_Inout_Array_Is_Sorted_167 {

    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int ans = numbers[start] + numbers[end];

            if (target == ans) {
                return new int[] { start + 1, end + 1 };
            } else if (target < ans) {
                end--;
            } else {
                start++;
            }
        }
        return new int[] { 0, 0 };
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        // int[] solution = twoSum(numbers, target);
        // System.out.println(solution);

        System.out.println(twoSum(numbers, target));
        

    }
}
