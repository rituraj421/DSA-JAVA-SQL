package PRACTICE.TCS;

import java.util.ArrayList;

public class tcs_1_Sheet {
    static int leap(int n) {
        if ((n % 400 == 0) || (n % 100 != 0) && (n % 4 == 0)) {
            return 1;
        }
        return 0;
    }
    // Given a number n, the task is to check whether the given number is positive,
    // negative, odd, even, or zero.

    static void chekcNum(int n) {
        if (n > 0 && n % 2 == 0) {
            System.out.println("The given number " + n + " positive as well as even number");
        }
        if (n < 0) {
            System.out.println("The given number " + n + " is negative");
        }

        if (n > 0 && n % 2 != 0) {
            System.out.println("The given number " + n + " is odd as well as positive");
        } else {
            System.out.println("Its a ZERO");
        }
    }
    // Given a natural number n, print all distinct divisors of it.

    static void divisor(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr.add(i);
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        // System.out.println(leap(4));
        // chekcNum(5);
        divisor(100);
    }
}
