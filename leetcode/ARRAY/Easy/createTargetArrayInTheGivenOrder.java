package leetcode.ARRAY.Easy;

import java.util.ArrayList;
import java.util.List;

class solution {
  public int[] createTargetArrayInTheGivenOrder(int[] nums, int[] index) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      list.add(index[i], nums[i]);
    }
    int[] ans = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      ans[i] = list.get(i);
    }
    return ans;
  }
}