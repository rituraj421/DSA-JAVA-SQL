package leetcode.ARRAY.Easy;

import java.util.HashMap;
import java.util.Map;

public class twoSum1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
   for (int i = 0; i < nums.length; i++) {
       int require  = target - nums[i];
       if (map.containsKey(require )) {
           return new int[] { map.get(require ), i };
       }
       map.put(nums[i], i);
   }
   throw new IllegalArgumentException("No two sum solution");
   }
}
