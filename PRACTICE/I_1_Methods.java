package PRACTICE;

public class I_1_Methods {
    // write a method to print multiplication table of a number
    static void table(int n) {
        int table1 = 1;
        for (int i = 1; i <= 10; i++) {
            table1 = n * i;
            // i++;
            System.out.println(table1);
            // System.out.println(n*i); // both will work
        }
    }

    // write a java program to print the pattern
    static void patternh(int n) {
        System.out.println("Question number 2: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // recursive function to calculate sum of first n natural numbers
    static int sum(int n) {
        int res = 0;
        if (n == 1) {
            return n;
        } else {
            res = n + sum(n - 1);
        }
        return res;
    }

    // function to print pattern
    static void pattern2(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // nth tern of fib series using recursion
    static int fib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);

    }

    // average of set of numbers passed as varargs
    public static void main(String[] args) {
        // table(3);
        // patternh(6);
        // System.out.println(sum(5));
        // pattern2(5);
        // System.out.println(fib(5));
    }
}
