package GFG_3_ARRAYS;

import java.util.Arrays;

public class arr_7_missingNum {
    static int missingNumber(int arr[], int size)
    {
        Arrays.sort(arr);
        int ans = 1;  // Initialize ans with the smallest positive number
        for (int i = 0; i < size; i++) {
            if (arr[i] == ans) {
                ans++;  // Increment ans if the current element is equal to ans
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        // int[] arr = {0,-10,1,3,-20};
        System.out.println(missingNumber(arr, 5));
    }
}
