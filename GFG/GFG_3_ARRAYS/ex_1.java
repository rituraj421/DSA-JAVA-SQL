package GFG_3_ARRAYS;

public class ex_1 {
    // find the given element in the array
    static int find(int[] arr, int n) {
        int len = arr.length - 1;
        for (int i = 0; i <= len; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }

    // insert an element
    static int insert(int [] arr, int x, int pos){
        int n = arr.length-1;
        int idx = pos-1;
        for(int i=n-1; i>=pos-1; i--){
            arr[i+1] = arr[i];
            arr[idx] = x;
        }
        return n+1;
    }

    public static void main(String[] args) {
        // int[] arr = { 20, 5, 7, 25 };
        // int n = 25;
        // System.out.println(find(arr, n));

        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 5;
        arr[2] = 10;
        arr[3] = 15;
        System.out.println(insert(arr, 3, 1));
    }
}
