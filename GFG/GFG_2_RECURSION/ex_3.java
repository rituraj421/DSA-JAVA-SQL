package GFG_2_RECURSION;

public class ex_3 {
    static void nto1(int n) {
        if (n == 0) {
            return;
        }
        nto1(n - 1);
        System.out.println(n + " ");
    }

    static void toN(int a) {
        if (a == 5) {
            return;
        }
        System.out.println(a);
        toN(a + 1);
    }

    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    // find the sum of first n natural numbers
    static int sum(int n) {
        if (n == 0) {
            return n;
        }
        return n + sum(n - 1); // 5+4+3+2+1
    }

    // fib(0,1,1,2,3,5,8,13)
    static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    // check if a given string is pallindrome or not
    static boolean palli(String s, int start, int end) {
        start = 0;
        end = s.length() - 1;
        if (start >= end) {
            return true;
        }
        return (s.charAt(start) == s.charAt(end)) && palli(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        // nto1(5);
        // toN(1);
        // System.out.println(fact(5));
        // System.out.println(sum(5));
        // System.out.println(fib(3));
        // String s = "abba";
        // System.out.println(palli(s, 0, 0));
    }
}
