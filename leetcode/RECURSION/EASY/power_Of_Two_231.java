package leetcode.RECURSION.EASY;

public class power_Of_Two_231 {
    
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        } else if (n == 1 || n % 2 == 0 && isPowerOfTwo(n / 2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(isPowerOfTwo(n));
    }
}