package leetcode.SORTING.EASY;

import java.util.Arrays;

public class can_Make_Arithmatic_Progression_From_Sequence_1502 {
    static boolean canMakeArithmaticProgression(int[] arr) {
        Arrays.sort(arr);
        int arithmatic = arr[0] - arr[1];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] - arr[i + 1] != arithmatic) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 1 };
        System.out.println(canMakeArithmaticProgression(arr));
    }
}
