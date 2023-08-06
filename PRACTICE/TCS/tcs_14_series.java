package PRACTICE.TCS;

public class tcs_14_series {
    static void series(int[] arr, int n) {
        int a = 7, b = 0, c = 0;
        for (int i = 1; i <= 8; i++) {
            c = a * b;
            b++;
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        series(null, 0);
    }
}
