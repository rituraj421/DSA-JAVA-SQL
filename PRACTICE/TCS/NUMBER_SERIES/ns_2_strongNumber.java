package PRACTICE.TCS.NUMBER_SERIES;

public class ns_2_strongNumber {
    static int stringNumber(int N) {
        int sum = 0;
        int temp = N;
        while (temp != 0) {
            int digit = temp % 10;
            sum += fact(digit);
            temp = temp / 10;
        }
        if (sum == N) {
            return 1;
        }
        return 0;
    }

    static int fact(int N) {
        if (N == 0 || N == 1) {
            return 1;
        }
        return N * fact(N - 1);
    }

    public static void main(String[] args) {
        // we need to find if the given number is strong or not
        // Strong Numbers are the numbers whose sum of factorial of digits is equal to
        // the original number. Given a number N, the task is to check if it is a Strong
        // Number or not. Print 1 if the Number is Strong, else Print 0.

        System.out.println(stringNumber(145));
    }
}
