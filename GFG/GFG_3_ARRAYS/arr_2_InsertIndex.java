package GFG_3_ARRAYS;

public class arr_2_InsertIndex {
    static void insertIdx(int[] arr, int index, int element, int n){
        for(int i = n-2; i>=index; i--){
            arr[i+1] = arr[i];
        }
        arr[index] = element;
        for(int num: arr){
            System.out.print(num+" ");
        }      
    }
    public static void main(String[] args) {
         int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 10;
        arr[3] = 15;
        insertIdx(arr, 2, 90, 5);
    }
}
