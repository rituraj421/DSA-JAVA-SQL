package Love_SDE_Sheet;

import java.util.Arrays;

public class l_sde_8_pairs_With_Certain_Difference {
    static int pairs(int[] arr, int k) {
        Arrays.sort(arr);
        int i = arr.length - 1;
        int sum = 0;
        while (i >= 1) {
            if (arr[i] - arr[i - 1] < k) {
                sum += arr[i] + arr[i - 1];
                i -= 2;
            } 
            else {
                i--;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 10, 15, 17, 12, 9 };
        System.out.println(pairs(arr, 4));
    }
}
