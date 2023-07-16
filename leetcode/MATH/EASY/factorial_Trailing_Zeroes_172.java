package leetcode.MATH.EASY;

public class factorial_Trailing_Zeroes_172 {
    static int fact(int n) {
        int count = 0;
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(fact(30));
    }
}
