package Love_SDE_Sheet;

import java.util.Arrays;

public class l_sde_10_smallest_subset_with_greater_sum {
    static int smallest(int[] arr) {
        long totalSum = 0;
        long currSum = 0;
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        for (int i = arr.length - 1; i > 0; i--) {
            totalSum -= arr[i];
            currSum += arr[i];
            count++;
            if (currSum > totalSum) {
                return count;
            }
        }
        return 1;

    }

    public static void main(String[] args) {
        int[] arr = { 20, 12, 18, 4 };
        System.out.println(smallest(arr));
    }
}
