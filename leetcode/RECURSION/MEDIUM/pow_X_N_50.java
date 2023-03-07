package leetcode.RECURSION.MEDIUM;

public class pow_X_N_50 {
    static double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        double ans = myPow(x, n / 2);

        if (n % 2 == 0) {
            return ans * ans;
        }
        else if (n % 2 == 1) {
            return x * ans * ans;
            
        } else {
            return (1 / x) * ans * ans;
        }
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.0, -2));
    }
}