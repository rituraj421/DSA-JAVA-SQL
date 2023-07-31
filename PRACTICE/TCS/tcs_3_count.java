package PRACTICE.TCS;

public class tcs_3_count {
    static int countGreater(int arr[]) {
        int count = 1;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1]) {
                count++;
            }
        }
        return count;
    }

    // anothe approach
    static int coutnGrt(int[] n) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 4, 8, 2, 9 };
        System.out.println(countGreater(arr));
        int[] n = { 7, 4, 8, 2, 9, 8, 9, 11 };
        System.out.println(coutnGrt(n));
    }
}
