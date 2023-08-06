package PRACTICE.TCS;

public class tcs_12_fees {
    static int fees(int[] arr) {
        int fee1 = 0;
        int fee2 = 0;
        int fee3 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 17) {
                fee1++;
            }
            if (arr[i] > 17 && arr[i] < 40) {
                fee2++;
            }
            if (arr[i] >= 40) {
                fee3++;
            }
        }
        return (fee1 * 200) + (fee2 * 400) + (fee3 * 300);
    }

    public static void main(String[] args) {
        int[] arr = { 20, 30, 40, 50, 2, 3, 14 };
        System.out.println(fees(arr));
    }
}
