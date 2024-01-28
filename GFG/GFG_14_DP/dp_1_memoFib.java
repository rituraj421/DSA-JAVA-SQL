package GFG_14_DP;

import java.util.Arrays;

public class dp_1_memoFib {

    static int[] memo;

    static int memoFib(int n) {

        if (memo[n] == -1) {
            int res;

            if (n == 0 || n == 1) {
                return n;
            } 
            else {
                res = memoFib(n - 1) + memoFib(n - 2);
            }
            memo[n] = res;
        }
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 5;

        memo = new int[n+1];

        Arrays.fill(memo, -1);
        
        System.out.println(memoFib(n));
    }
}
