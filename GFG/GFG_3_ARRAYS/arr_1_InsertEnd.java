package GFG_3_ARRAYS;

public class arr_1_InsertEnd {
    static void insertEnd(int[] arr, int element) {
        arr[arr.length - 1] = element;
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        // You are given an array arr. The size of the array is given by sizeOfArray.
        // You need to insert an element at the end.
        // Array already have the sizeofarray -1 elements.
        int arr[] = { 1, 2, 3, 4, 5 };
        insertEnd(arr, 6);
    }
}
