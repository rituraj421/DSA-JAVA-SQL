package leetcode.BINARY_SEARCH.Medium;

public class sum_Of_Square_Numbers_633 {

    static boolean judgeSquareSum(int c) {
        long a = 0;
        long b = (long) Math.sqrt(c);

        while (a <= b) {

            if (a * a + b * b == c) {
                return true;
            } else if (a * a + b * b < c) {
                a++;
            } else {
                b--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int c = 5;
        System.out.println(judgeSquareSum(c));
    }
}
