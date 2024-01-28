package Love_SDE_Sheet;

import java.util.Arrays;

public class l_sde_9_swap_And_maximise {
    static int swapAndMax(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        int sum = 0;
        while (i < j) {
            sum += (arr[j] - arr[i]);
            i++;
            j--;
        }
        return sum * 2;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 8 };
        System.out.println(swapAndMax(arr));
    }
}
