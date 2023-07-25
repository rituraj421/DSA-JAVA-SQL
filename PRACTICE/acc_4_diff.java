package PRACTICE;

public class acc_4_diff {
    static int diff(int[] arr, int diff, int num) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] - num <= 2) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = { 12, 3, 14, 56, 77, 13 };
        System.out.println(diff(arr, 2, 13));
    }

}
