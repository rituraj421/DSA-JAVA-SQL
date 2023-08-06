package PRACTICE.TCS;

public class tcs_6_candies {
    static int candies(int n, int k, int req) {
        int ans = 0;
        if (req <= k) {
            ans = (n - req);
        }
        if (req >= k) {
            return n;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 10;
        int k = 5;
        int req = 0;
        System.out.println(candies(n, k, req));
    }
}
