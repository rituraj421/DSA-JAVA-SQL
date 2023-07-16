package leetcode.MATH.EASY;

public class reverse_Integer_7 {
    static int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            int ld = x % 10;
            rev = rev * 10 + ld;
            x = x / 10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        if (x < 0) {
            return (int) (-1 * rev);
        }
        return (int) rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
