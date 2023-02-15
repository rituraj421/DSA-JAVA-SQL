package leetcode.BINARY_SEARCH.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class find_Target_Indices_After_Sorting_Array_2089 {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 2;
        // int start = 0, end = 0;
        // for(int i = 0; i< nums.length; i++){
        //     if(nums[i] == target){
        //         start ++;
        //     }
        //     if(nums[i] < target){
        //         end++;
        //     }
        // }

        // List<Integer> ans = new ArrayList<>();
        // for (int i = 0; i < start; i++) {
        //     ans.add(end++);
        // }
        // System.out.println(ans);;


        // SIMPLE SOLUTION 

        Arrays.sort(nums);

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
            ans.add(i);
            }
        }
        System.out.println(ans);;
    }
}
