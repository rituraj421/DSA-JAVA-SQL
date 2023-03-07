package leetcode.RECURSION.EASY;

public class fibonacci_Number_509 {
    // Approach 1
    public static int fib(int n) {
        int a = 1;
        int b = 0;
        if (n < 2) {
            return n;
        }
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            b = a;
            a = c;
        }
        return a;
    }

    // Approach 2
    public static int fibb(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fib(n));

        System.out.println(fibb(n));
    }
}
