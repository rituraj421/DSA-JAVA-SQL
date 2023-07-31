package GFG_2_RECURSION;

public class gfg_ex_4 {
    static void tower(int n, char A, char B, char C) {
        if (n == 1) {
            System.out.println(C);
            return;
        }
        tower(n - 1, A, B, C);
        System.out.println("" + C);
        tower(n - 1, B, A, C);
    }

    static int jos(int n, int k) {
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            ans = (ans + k) % i;
        }

        return ans + 1;
    }

    // recursive approach
    static int josh(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return josh(n - 1, k);
    }

    public static void main(String[] args) {
        // tower of henoi
        // tower(3, '1', '2', '3');
        System.out.println(jos(5, 3));
        System.out.println(josh(5, 3));
    }
}
