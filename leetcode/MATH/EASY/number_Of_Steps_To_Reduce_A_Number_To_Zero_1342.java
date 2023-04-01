package leetcode.MATH.EASY;

public class number_Of_Steps_To_Reduce_A_Number_To_Zero_1342 {
    static int numberOfSteps(int num) {
        int count = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
                count++;
            }
            if (num % 2 == 1) {
                num = num - 1;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }
}
