import java.util.*;

public class vipCafe {
    static int digit(int n){

        int temp = n;
        int rem = 0;
        int sum = 0;
        while (n % 10 == 0) {
            n = n % 10;
            rem = rem * 10 + n;
            n = n / 10;
            sum+=rem;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Sum of Digits:
        // Write a function to calculate the sum of digits of a given number until the
        // answer is single digit.
        // if digit = 999

        // int digit = 17;
        System.out.println(digit(17));
    }
}