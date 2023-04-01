package leetcode.MATH.EASY;

import java.util.*;

public class self_Dividing_Numbers_728 {

    static boolean isSelfDividing(int num) {
        String nums = Integer.toString(num);
        for (int i = 0; i < nums.length(); i++) {
            int digit = Character.getNumericValue(nums.charAt(i));
            if (digit == 0 || num % digit != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                ans.add(i);
            }
        }
        System.out.println(ans);
    }
}
