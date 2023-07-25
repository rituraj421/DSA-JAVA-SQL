package GFG_1_Bit;

public class gcd_Or_Hcf_of_two_numbers1_5 {
    static int gcd(int a, int b) {
        int res = Math.min(a, b);
        while (res > 0) {
            if (a % res == 0 && b % res == 0) {
                return res;
            } else {
                res--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(gcd(2, 4));
    }
}
