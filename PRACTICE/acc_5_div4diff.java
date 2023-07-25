package PRACTICE;

public class acc_5_div4diff {

    static int sumDiff(int n, int m) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= m; i++) {
            if (i % n == 0) {
                sum1 += i;
            }
            if (i % n != 0) {
                sum2 += i;
            }
        }
        int ans = Math.abs(sum2 - sum1);
        // return ans;
        return ans;

    }

    public static void main(String[] args) {
        // we need ti take two arguments n amd m
        // find the no. if digits divisible by 4 from 1 to m and calculate their sum
        // and then find the no. of digits not divisible by 4 from 1 to mand calculate
        // their sum
        // now return the difference of their sum

        System.out.println(sumDiff(4, 20));

    }
}
