package leetcode.MATH.EASY;

public class count_The_Digits_That_Divide_A_Number_2520 {
    static int countDigits(int num) {
        int count = 0;
        int digit = 0;
        int temp = num;
        while (num != 0) {
            digit = num % 10;
            if (temp % digit == 0) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(1234));
    }
}
