package GFG_3_ARRAYS;

public class arr_5_Stron {
    static void strong(int[] arr){
        StringBuilder result = new StringBuilder();
        
         for (int i = 0; i < arr.length-1; i++) {
           int max = arr[i] >= arr[i+1] ? arr[i] : arr[i+1];
           result.append(max).append(" ");
        
         }
         System.out.print(result);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5};
        strong(arr);
    }
}
