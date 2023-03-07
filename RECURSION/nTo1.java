package RECURSION;

public class nTo1 {
    public static void main(String[] args) {
        // int n = 5;
        dec(5);

        inc(0);

        palin(5);
    }

    // n to 1
    static void dec(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        dec(n - 1);
    }

    // 1 to n
    static void inc(int m) {
        if (m == 6) {
            return;
        }
        System.out.println(m + " ");
        inc(m + 1);
    }

    // palindrome kindaa
    static void palin(int p) {
        if (p == 0) {
            return;
        }
        System.out.println(p);
        palin(p - 1);
        System.out.println(p);
    }
}
