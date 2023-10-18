package GFG.GFG_00_Practice;

public class gfg_1_MissingNumberInAnArray {
    static int missingNumber(int[] arr) {
        // Arrays.sort(arr);
        int n = arr.length + 1;
        boolean[] seen = new boolean[n + 1];
        for (int num : arr) {
            seen[num] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (seen[i] == false) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        System.out.println(missingNumber(arr));

    }
}
