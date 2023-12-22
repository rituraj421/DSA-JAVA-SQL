package PRACTICE.TCS.NUMBER_SERIES;

public class ns_1_armstrongNumber {
    static boolean armstrong(int N) {
        int temp = N;
        int count = 0;
        int rem = 0;
        int sum = 0;
        // in the first step we will count the number of digits in the given inout
        while (temp != 0) {
            rem = temp % 10;
            count++;
            temp = temp / 10;
        }
        // now we will calculate the sum of the each digit
        // reset the temp to N
        temp = N;
        while (temp != 0) {
            rem = temp % 10;
            sum += Math.pow(rem, count);
            temp = temp / 10;
        }
        return (sum == N);
    }

    public static void main(String[] args) {
        // to check if a given number is armstring or not.
        System.out.println(armstrong(153));
    }
}
