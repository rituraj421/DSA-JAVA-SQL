package GFG_3_ARRAYS;

import java.util.Arrays;

public class arr_3_MeanAnsMedian {
    static void mM(int[] arr){
        Arrays.sort(arr);
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum+=arr[i];
        }
        int median = arr[arr.length/2];
        int mean = sum/arr.length;
        System.out.println(mean +" "+median);
    }
    public static void main(String[] args) {
        // for a given array we need to find the mean and median of an array
        int[] arr = {1,2,19,28,5};
        mM(arr);
    }
}
