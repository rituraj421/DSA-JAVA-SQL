package MATH;

public class remove_Duplicate {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 3, 5, 5 };
        int unique = 0;
        for (int num : nums) {
            unique ^= num;
        }
        System.out.println(unique);
    }
}
