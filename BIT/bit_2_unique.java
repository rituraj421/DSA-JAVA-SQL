package BIT;

public class bit_2_unique {
    static int unique1(int[] arr) {
        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 3, 4, 2, 6, 4, };
        System.out.println(unique1(arr));
    }
}
