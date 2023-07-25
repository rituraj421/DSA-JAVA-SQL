package PRACTICE;

public class acc_1_rat {

    static int rat(int r, int unit, int[] arr) {
        int required = r * unit;
        int sum = 0;
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum = sum + arr[i];
            count++;
            if (sum >= required) {
                break;
            }
            // else if (sum < required) {
            // return -1;
            // }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 8, 3, 5, 7, 4, 1, 2 };
        System.out.println(rat(7, 2, arr));
    }
}
