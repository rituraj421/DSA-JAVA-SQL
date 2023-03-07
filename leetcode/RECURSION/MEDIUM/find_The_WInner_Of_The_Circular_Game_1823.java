package leetcode.RECURSION.MEDIUM;

public class find_The_WInner_Of_The_Circular_Game_1823 {
    static int solve(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (solve(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        int ans = solve(6, 5) + 1;
        System.out.println(ans);
    }
}
