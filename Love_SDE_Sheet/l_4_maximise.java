package Love_SDE_Sheet;

import java.util.Arrays;

public class l_4_maximise {
    static int maximise(int[] arr) {
        Arrays.sort(arr);

        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = (sum + (long) arr[i] * i) % 1000000007;
        }
        return (int) sum;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 4, 1 };
        System.out.println(maximise(arr));
    }
}
