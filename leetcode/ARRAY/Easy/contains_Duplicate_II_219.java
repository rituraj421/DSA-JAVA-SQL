// package leetcode.ARRAY.Easy;

// import java.util.Arrays;

// public class contains_Duplicate_II_219 {
//     static int containsNearbyDuplicate(int[] nums, int k) {
//         // int count = 0;
//         // int ans = 0;
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = 0; j < nums.length; j++) {
//                 if (nums[i] == nums[j]) {
//                     i++;
//                     j++;
//                     int ans = (nums[i]);
//                     return  ans;
//                     // if (ans < k) {
//                     //     return ans;
//                     // }
//                 }
//             }
//         }
//         return 0;
//     }

//     public static void main(String[] args) {
//         int[] nums = { 1, 2, 3, 1, 2, 3 };
//         int k = 2;
//         System.out.println(containsNearbyDuplicate(nums, k));
//     }
// }
