package PRACTICE.TCS.NUMBER_SERIES;

public class ns_4_sumOfDigits {
    static int digitSum(int N) {
        int sum = 0;
        int temp = N;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp = temp / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        // int x = 5;
        // System.out.println(x++ + ++x);
        System.out.println(digitSum(12));
    }
}
