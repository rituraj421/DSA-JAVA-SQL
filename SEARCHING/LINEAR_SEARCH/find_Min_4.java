package SEARCHING.LINEAR_SEARCH;

public class find_Min_4 {
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { -10, 2, 3, 4, -5 };
        System.out.println(min(arr));
    }
}
