package GFG_3_ARRAYS;

public class arr_4_rotateArray {
    static void rotate(int [] arr, int d){
        // best way to do it is the reverse it and than rotate 
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int num: arr){
            System.out.print(num+" ");
        }
    }

    static void lRotateD11(int[] arr, int n, int d) {
        rotate(arr, d);
    }
    public static void main(String[] args) {
        // rotate a given array
        int[] arr = {1,2,3,4,5};
        lRotateD11(arr, 5, 2);
    }
}
