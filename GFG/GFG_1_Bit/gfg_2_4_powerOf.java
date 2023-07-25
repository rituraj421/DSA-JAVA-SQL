package GFG_1_Bit;

public class gfg_2_4_powerOf {
    static boolean power(long n) {
        if (n <= 0) {
            return false;
        }
        return ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        System.out.println(power(100));
    }
}
