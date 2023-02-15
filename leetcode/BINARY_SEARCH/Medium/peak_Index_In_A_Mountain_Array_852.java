package leetcode.BINARY_SEARCH.Medium;

import java.util.Arrays;

public class peak_Index_In_A_Mountain_Array_852 {

    static int peakIndexInMountainArray(int[] arr){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        
       

        while(start < end){
            int mid = start + (end-start) / 2;

            if(arr[mid] > arr[mid + 1]){
                return mid;
            }
            else {
                start = mid + 1;
            }
            }
            return end;
        }
    
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
}
