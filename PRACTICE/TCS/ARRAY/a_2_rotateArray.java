package PRACTICE.TCS.ARRAY;

public class a_2_rotateArray {
    static void rotateArray(int[] arr, int d) {
        int[] ans = new int[arr.length];
        int n = arr.length;
        for (int i = d; i < arr.length; i++) {
            ans[i - d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            ans[n - d + i] = arr[i];
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        rotateArray(arr, 2);
    }
}
