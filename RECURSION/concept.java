package RECURSION;

public class concept {
    public static void main(String[] args) {
        con(5);

        rev1(1234);
        System.out.println(sum);
    }

    static void con(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        con(--n); // n-- and --n are different, check both u will get different answers
    }

    // reverse a number
    // approach 1
    static int sum = 0;

    static void rev1(int m) {
        if (m == 0) {
            return;
        }
        int rem = m % 10;
        sum = sum * 10 + rem;
        rev1(m / 10);
    }
    // approach 2
    
}
