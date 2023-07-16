package GFG;

public class leadingZeroes1_4 {
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    static int zero(int f) {
        int res = 0;
        while (f % 10 == 0) {
            f = f / 10;
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(zero(1200));
    }
}
