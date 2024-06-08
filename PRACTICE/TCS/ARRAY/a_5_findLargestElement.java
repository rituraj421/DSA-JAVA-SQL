package PRACTICE.TCS.ARRAY;

public class a_5_findLargestElement {
    static int largest(int []arr){
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] arr = { 1, 8, 30, -5, 20, 7 };
        System.out.println(largest(arr));
    }
}
